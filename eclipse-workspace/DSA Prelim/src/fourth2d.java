public class fourth2d
{
    public static void main(String[] args)
    {
        char rows = 'a';
        String spot;

        int[][] grid = new int [8][8];

        for(int i = 0; i < grid.length; i++, rows++)
        {
            for(int col = 0; col < grid[i].length; col++)
            {
                System.out.print(rows + "" + (col + 1) + " ");
            }

            System.out.println();
        }
    }

}