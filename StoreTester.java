
/**
 * Write a description of class StoreTester here.
 *
 * @author Anish Gupta
 * @version 9/27/21
 */
public class StoreTester
{
    public static void main (String[] args)
    {
        TargetStore[] items = new TargetStore[10];
        items[0] = new TargetStore("Mask", 10001, 12.99, 200);
        items[1] = new TargetStore("Milk", 265, 5.99, 50);
        items[2] = new TargetStore("Eggs", 799, 7.99, 100);
        items[3] = new TargetStore("Chair", 444, 156.99, 5);
        items[4] = new TargetStore("Bike", 112, 560.99, 10);
        items[5] = new TargetStore("Apple", 456, 3.99, 500);
        items[6] = new TargetStore("Kettle", 786, 45.99, 40);
        items[7] = new TargetStore("Watch", 369, 344.99, 20);
        items[8] = new TargetStore("Pan", 147, 78.99, 35);
        items[9] = new TargetStore("Spice", 258, 15.99, 8);

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Initial Target Product Data:");
        System.out.println();
        System.out.printf("%-10s %10s   %6s %10s\n", "Name", "Number", "Price", "Quantity");
        System.out.println("----------------------------------------------------------------");
        printData(items);
        System.out.println();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Insertion Sort of Product Number (Ascending):");
        items = insertionNum(items, 1);
        System.out.println();
        System.out.printf("%-10s %10s   %6s %10s\n", "Name", "Number", "Price", "Quantity");
        System.out.println("----------------------------------------------------------------");
        printData(items);
        System.out.println();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Insertion Sort of Product Number (Descending):");
        items = insertionNum(items, 2);
        System.out.println();
        System.out.printf("%-10s %10s   %6s %10s\n", "Name", "Number", "Price", "Quantity");
        System.out.println("----------------------------------------------------------------");
        printData(items);
        System.out.println();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Insertion Sort of Product Name (Ascending):");
        items = insertionName(items, 1);
        System.out.println();
        System.out.printf("%-10s %10s   %6s %10s\n", "Name", "Number", "Price", "Quantity");
        System.out.println("----------------------------------------------------------------");
        printData(items);
        System.out.println();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Insertion Sort of Product Name (Descending):");
        items = insertionName(items, 2);
        System.out.println();
        System.out.printf("%-10s %10s   %6s %10s\n", "Name", "Number", "Price", "Quantity");
        System.out.println("----------------------------------------------------------------");
        printData(items);
        System.out.println();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Insertion Sort of Product Price (Ascending):");
        items = insertionPrice(items, 1);
        System.out.println();
        System.out.printf("%-10s %10s   %6s %10s\n", "Name", "Number", "Price", "Quantity");
        System.out.println("----------------------------------------------------------------");
        printData(items);
        System.out.println();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Insertion Sort of Product Price (Descending):");
        items = insertionPrice(items, 2);
        System.out.println();
        System.out.printf("%-10s %10s   %6s %10s\n", "Name", "Number", "Price", "Quantity");
        System.out.println("----------------------------------------------------------------");
        printData(items);
        System.out.println();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Selection Sort of Product Number (Ascending):");
        items = selectionNum(items, 1);
        System.out.println();
        System.out.printf("%-10s %10s   %6s %10s\n", "Name", "Number", "Price", "Quantity");
        System.out.println("----------------------------------------------------------------");
        printData(items);
        System.out.println();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Selection Sort of Product Number (Descending):");
        items = selectionNum(items, 2);
        System.out.println();
        System.out.printf("%-10s %10s   %6s %10s\n", "Name", "Number", "Price", "Quantity");
        System.out.println("----------------------------------------------------------------");
        printData(items);
        System.out.println();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Selection Sort of Product Name (Ascending):");
        items = selectionName(items, 1);
        System.out.println();
        System.out.printf("%-10s %10s   %6s %10s\n", "Name", "Number", "Price", "Quantity");
        System.out.println("----------------------------------------------------------------");
        printData(items);
        System.out.println();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Selection Sort of Product Name (Descending):");
        items = selectionName(items, 2);
        System.out.println();
        System.out.printf("%-10s %10s   %6s %10s\n", "Name", "Number", "Price", "Quantity");
        System.out.println("----------------------------------------------------------------");
        printData(items);
        System.out.println();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Selection Sort of Product Price (Ascending):");
        items = selectionPrice(items, 1);
        System.out.println();
        System.out.printf("%-10s %10s   %6s %10s\n", "Name", "Number", "Price", "Quantity");
        System.out.println("----------------------------------------------------------------");
        printData(items);
        System.out.println();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Selection Sort of Product Price (Descending):");
        items = selectionPrice(items, 2);
        System.out.println();
        System.out.printf("%-10s %10s   %6s %10s\n", "Name", "Number", "Price", "Quantity");
        System.out.println("----------------------------------------------------------------");
        printData(items);
        System.out.println();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Merge Sort of Product Number (Ascending):");
        mergeSortNum(items, 1, 0, items.length - 1);
        System.out.println();
        System.out.printf("%-10s %10s   %6s %10s\n", "Name", "Number", "Price", "Quantity");
        System.out.println("----------------------------------------------------------------");
        printData(items);
        System.out.println();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Merge Sort of Product Name (Ascending):");
        mergeSortName(items, 1, 0, items.length - 1);
        System.out.println();
        System.out.printf("%-10s %10s   %6s %10s\n", "Name", "Number", "Price", "Quantity");
        System.out.println("----------------------------------------------------------------");
        printData(items);
        System.out.println();

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("Merge Sort of Product Price (Ascending):");
        mergeSortPrice(items, 1, 0, items.length - 1);
        System.out.println();
        System.out.printf("%-10s %10s   %6s %10s\n", "Name", "Number", "Price", "Quantity");
        System.out.println("----------------------------------------------------------------");
        printData(items);
        System.out.println();

    }

    public static void printData(TargetStore[] obj)
    {
        for(int i = 0; i < obj.length; i++)
        {
            System.out.printf(obj[i].toString());
        }
    }

    public static TargetStore[] insertionNum(TargetStore[] obj, int typeOfSort)
    {
        TargetStore[] dest = new TargetStore[ obj.length ];

        if (typeOfSort == 1)
        {
            for( int i = 0 ; i < obj.length ; i++ )
            {
                TargetStore next = obj[ i ];
                int insertIndex = 0;
                int k = i;
                while( k > 0 && insertIndex == 0 )
                {
                    if(next.getProductNum() > dest[k-1].getProductNum())
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }

                dest[ insertIndex ] = next;          
            } // end of for            
        }

        if (typeOfSort == 2)
        {
            for( int i = 0 ; i < obj.length ; i++ )
            {
                TargetStore next = obj[ i ];
                int insertIndex = 0;
                int k = i;
                while( k > 0 && insertIndex == 0 )
                {
                    if(next.getProductNum() < dest[k-1].getProductNum())
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }

                dest[ insertIndex ] = next;          
            } // end of for            
        }

        return dest;
    }

    public static TargetStore[] insertionName(TargetStore[] obj, int typeOfSort)
    {
        TargetStore[] dest = new TargetStore[ obj.length ];

        if (typeOfSort == 1)
        {
            for( int i = 0 ; i < obj.length ; i++ )
            {
                TargetStore next = obj[ i ];
                int insertIndex = 0;
                int k = i;
                while( k > 0 && insertIndex == 0 )
                {
                    if( next.getName().compareTo( dest[k-1].getName() ) > 0 )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }

                dest[ insertIndex ] = next;          
            } // end of for            
        }

        if (typeOfSort == 2)
        {
            for( int i = 0 ; i < obj.length ; i++ )
            {
                TargetStore next = obj[ i ];
                int insertIndex = 0;
                int k = i;
                while( k > 0 && insertIndex == 0 )
                {
                    if( next.getName().compareTo( dest[k-1].getName() ) < 0 )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }

                dest[ insertIndex ] = next;          
            } // end of for            
        }

        return dest;
    }

    public static TargetStore[] insertionPrice(TargetStore[] obj, int typeOfSort)
    {
        TargetStore[] dest = new TargetStore[ obj.length ];

        if (typeOfSort == 1)
        {
            for( int i = 0 ; i < obj.length ; i++ )
            {
                TargetStore next = obj[ i ];
                int insertIndex = 0;
                int k = i;
                while( k > 0 && insertIndex == 0 )
                {
                    if(next.getPrice() > dest[k-1].getPrice())
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }

                dest[ insertIndex ] = next;          
            } // end of for            
        }

        if (typeOfSort == 2)
        {
            for( int i = 0 ; i < obj.length ; i++ )
            {
                TargetStore next = obj[ i ];
                int insertIndex = 0;
                int k = i;
                while( k > 0 && insertIndex == 0 )
                {
                    if(next.getPrice() < dest[k-1].getPrice())
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }

                dest[ insertIndex ] = next;          
            } // end of for            
        }

        return dest;
    }

    public static TargetStore[] selectionNum(TargetStore[] obj, int typeOfSort)
    {
        int i;
        int k;
        int posMax;
        TargetStore temp;

        if (typeOfSort == 1)
            for ( i = obj.length - 1 ; i >= 0 ; i-- )
            {
                // find largest element in the i elements
                posMax = 0;
                for ( k = 0 ; k <= i ; k++ )
                {
                    if ( obj[ k ].getProductNum() > obj[ posMax ].getProductNum())
                        posMax = k;
                }

                temp = obj[ i ];
                obj[ i ] = obj[posMax ];
                obj[ posMax ] = temp;            
            }
        if (typeOfSort == 2)
            for ( i = obj.length - 1 ; i >= 0 ; i-- )
            {
                // find largest element in the i elements
                posMax = 0;
                for ( k = 0 ; k <= i ; k++ )
                {
                    if ( obj[ k ].getProductNum() < obj[ posMax ].getProductNum())
                        posMax = k;
                }

                temp = obj[ i ];
                obj[ i ] = obj[posMax ];
                obj[ posMax ] = temp;            
            }
        return obj;
    }

    public static TargetStore[] selectionName(TargetStore[] obj, int typeOfSort)
    {
        int i;
        int k;
        int posMax;
        TargetStore temp;

        if (typeOfSort == 1)
            for ( i = obj.length - 1 ; i >= 0 ; i-- )
            {
                // find largest element in the i elements
                posMax = 0;
                for ( k = 0 ; k <= i ; k++ )
                {
                    if ( obj[ k ].getName().compareTo(obj[ posMax ].getName()) > 0 )
                        posMax = k;
                }

                temp = obj[ i ];
                obj[ i ] = obj[posMax ];
                obj[ posMax ] = temp;            
            }
        if (typeOfSort == 2)
            for ( i = obj.length - 1 ; i >= 0 ; i-- )
            {
                // find largest element in the i elements
                posMax = 0;
                for ( k = 0 ; k <= i ; k++ )
                {
                    if ( obj[ k ].getName().compareTo(obj[ posMax ].getName()) < 0 )
                        posMax = k;
                }

                temp = obj[ i ];
                obj[ i ] = obj[posMax ];
                obj[ posMax ] = temp;            
            }
        return obj;
    }

    public static TargetStore[] selectionPrice(TargetStore[] obj, int typeOfSort)
    {
        int i;
        int k;
        int posMax;
        TargetStore temp;

        if (typeOfSort == 1)
            for ( i = obj.length - 1 ; i >= 0 ; i-- )
            {
                // find largest element in the i elements
                posMax = 0;
                for ( k = 0 ; k <= i ; k++ )
                {
                    if ( obj[ k ].getPrice() > obj[ posMax ].getPrice())
                        posMax = k;
                }

                temp = obj[ i ];
                obj[ i ] = obj[posMax ];
                obj[ posMax ] = temp;            
            }
        if (typeOfSort == 2)
            for ( i = obj.length - 1 ; i >= 0 ; i-- )
            {
                // find largest element in the i elements
                posMax = 0;
                for ( k = 0 ; k <= i ; k++ )
                {
                    if ( obj[ k ].getPrice() < obj[ posMax ].getPrice())
                        posMax = k;
                }

                temp = obj[ i ];
                obj[ i ] = obj[posMax ];
                obj[ posMax ] = temp;            
            }
        return obj;
    }

    public static void mergeSortNum(TargetStore[] obj, int typeOfSort, int low, int high)
    {
        if( low == high )
            return;

        int mid = ( low + high ) / 2;

        mergeSortNum(obj,typeOfSort, low, mid );       // recursive call
        mergeSortNum(obj,typeOfSort, mid + 1, high);

        mergeNum(obj,typeOfSort, low, mid, high);
    }

    public static void mergeNum(TargetStore[] obj, int typeOfSort, int low, int mid, int high)
    {
        if (typeOfSort == 1)
        {
            TargetStore[] temp = new TargetStore[ high - low + 1 ];

            int i = low, j = mid + 1, n = 0;

            while( i <= mid || j <= high )
            {
                if( i > mid )
                {
                    temp[ n ] = obj[ j ];
                    j++;
                }
                else if( j > high )
                {
                    temp[ n ] = obj[ i ];
                    i++;
                }
                else if( obj[ i ].getProductNum() < obj[ j ].getProductNum())
                {
                    temp[ n ] = obj[ i ];
                    i++;
                }
                else
                {
                    temp[ n ] = obj[ j ];
                    j++;
                }
                n++;
            }

            for( int k = low ; k <= high ; k++ )
                obj[ k ] = temp[ k - low ];
        }
        if (typeOfSort == 2)
        {
            TargetStore[] temp = new TargetStore[ high - low + 1 ];

            int i = low, j = mid + 1, n = 0;

            while( i <= mid || j <= high )
            {
                if( i > mid )
                {
                    temp[ n ] = obj[ j ];
                    j++;
                }
                else if( j > high )
                {
                    temp[ n ] = obj[ i ];
                    i++;
                }
                else if( obj[ i ].getProductNum() > obj[ j ].getProductNum())
                {
                    temp[ n ] = obj[ i ];
                    i++;
                }
                else
                {
                    temp[ n ] = obj[ j ];
                    j++;
                }
                n++;
            }

            for( int k = low ; k <= high ; k++ )
                obj[ k ] = temp[ k - low ];
        }

    }

    public static void mergeSortName(TargetStore[] obj, int typeOfSort, int low, int high)
    {
        if( low == high )
            return;

        int mid = ( low + high ) / 2;

        mergeSortName(obj,typeOfSort, low, mid );       // recursive call
        mergeSortName(obj,typeOfSort, mid + 1, high);

        mergeName(obj,typeOfSort, low, mid, high);
    }

    public static void mergeName(TargetStore[] obj, int typeOfSort, int low, int mid, int high)
    {
        if (typeOfSort == 1)
        {
            TargetStore[] temp = new TargetStore[ high - low + 1 ];

            int i = low, j = mid + 1, n = 0;

            while( i <= mid || j <= high )
            {
                if( i > mid )
                {
                    temp[ n ] = obj[ j ];
                    j++;
                }
                else if( j > high )
                {
                    temp[ n ] = obj[ i ];
                    i++;
                }
                else if( obj[ i ].getName().compareTo(obj[ j ].getName()) < 0 )
                {
                    temp[ n ] = obj[ i ];
                    i++;
                }
                else
                {
                    temp[ n ] = obj[ j ];
                    j++;
                }
                n++;
            }

            for( int k = low ; k <= high ; k++ )
                obj[ k ] = temp[ k - low ];
        }
        if (typeOfSort == 2)
        {
            TargetStore[] temp = new TargetStore[ high - low + 1 ];

            int i = low, j = mid + 1, n = 0;

            while( i <= mid || j <= high )
            {
                if( i > mid )
                {
                    temp[ n ] = obj[ j ];
                    j++;
                }
                else if( j > high )
                {
                    temp[ n ] = obj[ i ];
                    i++;
                }
                else if( obj[ i ].getName().compareTo(obj[ j ].getName()) > 0 )
                {
                    temp[ n ] = obj[ i ];
                    i++;
                }
                else
                {
                    temp[ n ] = obj[ j ];
                    j++;
                }
                n++;
            }

            for( int k = low ; k <= high ; k++ )
                obj[ k ] = temp[ k - low ];
        }

    }

    public static void mergeSortPrice(TargetStore[] obj, int typeOfSort, int low, int high)
    {
        if( low == high )
            return;

        int mid = ( low + high ) / 2;

        mergeSortPrice(obj,typeOfSort, low, mid );       // recursive call
        mergeSortPrice(obj,typeOfSort, mid + 1, high);

        mergePrice(obj,typeOfSort, low, mid, high);
    }

    public static void mergePrice(TargetStore[] obj, int typeOfSort, int low, int mid, int high)
    {
        if (typeOfSort == 1)
        {
            TargetStore[] temp = new TargetStore[ high - low + 1 ];

            int i = low, j = mid + 1, n = 0;

            while( i <= mid || j <= high )
            {
                if( i > mid )
                {
                    temp[ n ] = obj[ j ];
                    j++;
                }
                else if( j > high )
                {
                    temp[ n ] = obj[ i ];
                    i++;
                }
                else if( obj[ i ].getPrice() < obj[ j ].getPrice())
                {
                    temp[ n ] = obj[ i ];
                    i++;
                }
                else
                {
                    temp[ n ] = obj[ j ];
                    j++;
                }
                n++;
            }

            for( int k = low ; k <= high ; k++ )
                obj[ k ] = temp[ k - low ];
        }
        if (typeOfSort == 2)
        {
            TargetStore[] temp = new TargetStore[ high - low + 1 ];

            int i = low, j = mid + 1, n = 0;

            while( i <= mid || j <= high )
            {
                if( i > mid )
                {
                    temp[ n ] = obj[ j ];
                    j++;
                }
                else if( j > high )
                {
                    temp[ n ] = obj[ i ];
                    i++;
                }
                else if( obj[ i ].getPrice() > obj[ j ].getPrice())
                {
                    temp[ n ] = obj[ i ];
                    i++;
                }
                else
                {
                    temp[ n ] = obj[ j ];
                    j++;
                }
                n++;
            }

            for( int k = low ; k <= high ; k++ )
                obj[ k ] = temp[ k - low ];
        }

    }
}