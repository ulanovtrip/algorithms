package allen_downey.chapter_3;

public class ListNode {

    //data ссылка на какой-либо объект
    public Object data;
    //next ссылается на следующий узел в списке
    public ListNode next;

    public ListNode() {
        this.data = null;
        this.next = null;
    }

    public ListNode(Object data) {
        this.data = data;
        //В последнем узле списка переменная next по соглашению равна null
        this.next = null;
    }

    public ListNode(Object data, ListNode next) {
        this.data = data;
        //В последнем узле списка переменная next по соглашению равна null
        this.next = next;
    }

    public String toString() {
        return "ListNode(" + data.toString() + ")";
    }
}
