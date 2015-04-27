import java.util.*;

public class Sorts
{
  public void bubbleSort(int[] list)
  {
    for(int j=0; j < list.length-1; j++)
    {
      for(int i=0; i < list.length-j-1; i++)
      {
        if(list[i] > list[i+1])
        {
          int blah = list[i];
          list[i] = list[i+1];
          list[i+1] = blah;
        }
      }
    }
  }

  public void selectionSort(int[] list)
  {
    int flag, blah;
    for(int j=0; j < list.length-1; j++)
    {
      flag = j;
      for(int i=j+1; i < list.length; i++)
      {
        if(list[i] < list[flag])
        {
          flag = i;
        }
      }
      blah = list[j];
      list[j] = list[flag];
      list[flag] = blah;
    }
  }

  public void insertionSort(int[] list)
  {
    for(int j=1; j < list.length; j++)
    {
      int pos = j;
      int blah = list[pos];
      while(pos > 0 && list[pos-1] > blah)
      {
        list[pos] = list[pos-1];
        pos--;
      }
      list[pos] = blah;
    }
  }

  private void merge(int[] a, int first, int mid, int last)
  {
    int [] c = new int[a.length];
    int nA = first;
    int nB = mid + 1;
    for(int i = first; i <= last; i++)
    {
      if(nA > mid)
      {
        c[i] = a[nB];
        nB++;
      }
      else if(nB > last)
      {
        c[i] = a[nA];
        nA++;
      }
      else if(a[nA] > a[nB])
      {
        c[i] = a[nB];
        nB++;
      }
      else
      {
        c[i] = a[nA];
        nA++;
      }
    }
    for(int i = first; i <= last; i++)
    {
      a[i] = c[i];
    }
  }

  public void mergeSort(int[] a, int first, int last)
  {
    int mid = (first+last)/2;
    if((first != mid) && (last != (mid+1)))
    {
      mergeSort(a, first, mid);
      mergeSort(a, mid + 1, last);
    }
    merge(a, first, mid, last);
  }
}
