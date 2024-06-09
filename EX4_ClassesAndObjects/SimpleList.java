public class SimpleList {
  private SimpleNode nil;

  SimpleList(){
    init();
  }

  void init(){
    nil = new SimpleNode();
    nil.setNext(nil);
    nil.setPrev(nil);
  }

  SimpleNode listSearch(int key){
    SimpleNode cur = new SimpleNode();
    cur = nil.next;
  while(true){
    if(cur == null)return cur;
    if(cur.key == key)return cur;
    cur = cur.next;
  }
  }

  void printList(){
    SimpleNode cur = new SimpleNode();
    cur = nil.next;
    while(true){
      if(cur == nil) break;
      System.out.print(cur.key + " ");
      cur = cur.next;
    }
    System.out.println();
  }

  void delete(int key){
    SimpleNode cur = new SimpleNode();
    cur = listSearch(key);
    if(cur != nil || cur != null){
      cur.prev.setNext(cur.next);
      cur.next.setPrev(cur.prev);
    }
  }

  void insert(int K){
    SimpleNode SN = new SimpleNode();
    SN.setKey(K);
    SN.setPrev(nil);

    if( nil.next != null){
      SN.setNext(nil.next);
      SN.next.setPrev(SN);
      nil.setNext(SN);
    } else {
      nil.setNext(SN);
    }
  }
}
