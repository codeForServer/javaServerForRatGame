package thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * �̳߳ع���
 */
public class ThreadPoolManager2 {
 
 private static ThreadPoolManager2 tpm = new ThreadPoolManager2();

 // �̳߳�ά���̵߳���������
 private final static int CORE_POOL_SIZE = 3;

 // �̳߳�ά���̵߳��������
 private final static int MAX_POOL_SIZE = 10;

 // �̳߳�ά���߳�������Ŀ���ʱ��
 private final static int KEEP_ALIVE_TIME = 0;

 // �̳߳���ʹ�õĻ�����д�С
 private final static int WORK_QUEUE_SIZE = 10;

 // �����������
 private final static int TASK_QOS_PERIOD = 10;

 // ���񻺳����
 private Queue<Runnable> taskQueue = new LinkedList<Runnable>();

 /*
  * �̳߳س�������ʱ��������뻺�����
  */
 final RejectedExecutionHandler handler = new RejectedExecutionHandler() {
  public void rejectedExecution(Runnable task, ThreadPoolExecutor executor) {
   taskQueue.offer(task);
  }
 };

 /*
  * ����������е��������¼��ص��̳߳�
  */
 final Runnable accessBufferThread = new Runnable() {
  public void run() {
   if (hasMoreAcquire()) {
    threadPool.execute(taskQueue.poll());
   }
  }
 };

 /*
  * ����һ�������̳߳�
  */
 final ScheduledExecutorService scheduler = Executors
   .newScheduledThreadPool(1);

 /*
  * ͨ�������߳������Ե�ִ�л������������
  */
 final ScheduledFuture<?> taskHandler = scheduler.scheduleAtFixedRate(
   accessBufferThread, 0, TASK_QOS_PERIOD, TimeUnit.MILLISECONDS);

 /*
  * �̳߳�
  */
 final ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
   CORE_POOL_SIZE, MAX_POOL_SIZE, KEEP_ALIVE_TIME, TimeUnit.SECONDS,
   new ArrayBlockingQueue<Runnable>(WORK_QUEUE_SIZE), this.handler);

 /*
  * �����췽���������η���Ϊ˽�У���ֹ����ʵ������
  */
 private ThreadPoolManager2() {

 }

 /*
  * �̳߳ص�����������
  */
 public static ThreadPoolManager2 newInstance() {
  return tpm;
 }

 /*
  * ��Ϣ���м�鷽��
  */
 private boolean hasMoreAcquire() {
  return !taskQueue.isEmpty();
 }

 /*
  * ���̳߳���������񷽷�
  */
 public void addExecuteTask(Runnable task) {
  if (task != null) {
   threadPool.execute(task);
  }
 }
}