public class SimpleList implements Aggregate{
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
    SimpleNode cur =  nil.next;
    while(cur != nil && cur.key != key) cur = cur.next;
    return cur;
  }

  void delete(int key){
    SimpleNode cur = listSearch(key);
    if(cur == nil) return;
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

  public Iterator forwardIterator(){
    return new SimpleListForwardIterator(this);
  }

  public Iterator backwardIterator(){
    return new SimpleListBackwardIterator(this);
  }

  public SimpleNode getNil(){
    return nil;
  }
}
