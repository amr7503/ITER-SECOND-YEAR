import java.util.*;
public class BFS
{
    public static void addUndirectedEdge(List<List<Integer>> adj, int s, int t)
    {
        adj.get(s).add(t);
        adj.get(t).add(s);
    }
    public static void print(List<List<Integer>> adj, int v)
    {
        for(int i=0;i<v;i++)
        {
            System.out.print("Vertex "+i+" is connected to: ");
            for(int x:adj.get(i))
                System.out.print(x+" , ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int i,v,e,s,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of vertices");
        v=sc.nextInt();

        List<List<Integer> > adj=new ArrayList(v);
        for(i=0;i<v;i++)
            adj.add(new ArrayList<>());

        System.out.print("Enter the number of edges(e)= ?");
        e=sc.nextInt();

        System.out.println("Enter the edges ");
        for(i=0;i<e;i++)
        {
            s=sc.nextInt();
            t=sc.nextInt();
            addUndirectedEdge(adj, s, t);
        }

        print(adj,v);

        boolean[] visited=new boolean[v+1];



        //call dfs on (adj,visited,source)

        System.out.println("Enter source vertex ");
        int source=sc.nextInt();
        System.out.println("Breadth first search traversal from source "+source+" is ::: ");

        for (i = 0; i < adj.size(); i++)  // To make it work for disconnected components too visited is maintained
            if (!visited[i]) {
                bfs(adj, visited,i);
            }


    }

    public static void bfs(List<List<Integer>> adj,boolean[] visited,int source)
    {
        Queue<Integer> q=new LinkedList<>();

        visited[source]=true;
        q.add(source);

        while(!q.isEmpty())
        {
            int node=q.poll(); //poll(): Removes and returns the element at the front of the queue
            System.out.print(node+" ");
            for(int x:adj.get(node))
            {
                if(!visited[x])
                {
                    q.add(x);
                    visited[x]=true;
                }
            }

        }
        System.out.println();
    }


}

/*
    --------------
    |   OUTPUT   | 
    --------------
   
Enter number of vertices
5
Enter the number of edges(e)= ?5
Enter the edges 
0 1
0 2
1 3
1 4
2 4
Vertex 0 is connected to: 1 , 2 , 
Vertex 1 is connected to: 0 , 3 , 4 , 
Vertex 2 is connected to: 0 , 4 , 
Vertex 3 is connected to: 1 , 
Vertex 4 is connected to: 1 , 2 , 
Enter source vertex 
0
Breadth first search traversal from source 0 is ::: 
0 1 2 3 4 


REFERENCE :- https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
 */