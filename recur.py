# MERGE SORT USING RECURSION
def merge(a1,a2,a):
     i=0;j=0;k=0;
     while(i<len(a1) and j<len(a2)):
         if a1[i]<a2[j]:
             a[k]=a1[i];
             i+=1;
             k+=1;
         else:
             a[k]=a2[j];
             j+=1;
             k+=1;
     while(i<len(a1)):
         a[k]=a1[i];
         i+=1;
         k+=1;
     while(j<len(a2)):
         a[k]=a2[j];
         j+=1;
         k+=1;
