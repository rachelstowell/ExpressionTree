
public class BTNode<E> {
    private E data;
    private BTNode<E> left;
    private BTNode<E> right;

    public BTNode(E initialData, BTNode initialRight, BTNode initialLeft){

        data = initialData;
        right = initialRight;
        left = initialLeft;

    }

    public E getData( )
    {
        return data;
    }

    public BTNode getLeft( )
    {
        return left;
    }

    public BTNode getRight( )
    {
        return right;
    }

    public E getLeftmostData( )
    {
        if (left == null)
            return data;
        else
            return left.getLeftmostData( );
    }

    public E getRightmostData( )
    {
        if (left == null)
            return data;
        else
            return left.getRightmostData( );
    }

    public void setData(E x )
    {
        data = x;
    }

    public void setLeft(BTNode<E> x){
        left = x;
    }
    public void setRight(BTNode<E> x){
        right = x;
    }

    public void preorderPrint( )
    {
        System.out.println(data);
        if (left != null)
            left.preorderPrint( );
        if (right != null)
            right.preorderPrint( );
    }



    public void postorderPrint( )
    {
        if (left != null)
            left.postorderPrint( );
        if (right != null)
            right.postorderPrint( );
        System.out.println(data);
    }




    public void inorderPrint( )
    {
        if (left != null) {
            System.out.print("(");
            left.inorderPrint();
        }
        System.out.print(" " +
                data + " ");
        if (right != null) {
            right.inorderPrint();
            System.out.print(")");
        }
    }


}
