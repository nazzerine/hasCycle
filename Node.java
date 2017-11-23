package hasCycle;

//general node class for singly linked list implementation

private static class Node<E> {
		// make these private and access them thru access methods
		private E element;
		private Node<E> next;
		
		//constructor
		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}
		//accessor methods
		public E getElement() {
			return element;
		}
	
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> n) {
			next = n;
		}
	}
