static Node intersectingNode(Node headA, Node headB)
{
    ArrayList<Node> al1 = new ArrayList<>();
    ArrayList<Node> al2 = new ArrayList<>();

    while(headA != null) {
        al1.add(headA);
        headA = headA.next;
    }

    while(headB != null) {
        al2.add(headB);
        headB = headB.next;
    }

    for(int i = 0; i < al1.size(); i++) {
        for(int j = 0; j < al2.size(); j++) {
            if(al1.get(i) == al2.get(j)) {
                return al1.get(i);
            }
        }
    }

    return null;
