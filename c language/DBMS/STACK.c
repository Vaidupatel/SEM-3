#include<stdio.h>
 
#include<stdlib.h>
int stack[10],choice,n,top,x,i;
void push();
void pop();
void display();


int main()
{
while(1)
 {
 printf("\nOperations performed by Stack");
        printf("\n1.Push the element\n2.Pop the element\n3.display");
        printf("\n\nEnter the choice:");
        scanf("%d",&choice);
         
         switch (choice)
         {
            case 1: push();
                break;
            case 2: pop();
                break;
            
            case 3: display();
                break;
            case 4:exit(0);
                        default: printf("\nInvalid choice!!");
            
         
         }
 }
}

void push()
{
    if(top==-1)
    {
    printf("\n underflow");
    }
    else
    {
    printf("\n enter the element to be inserted in to stack: \n");
    scanf("%d",&n);
    top=top+1;
    stack[top]=n;
    }

}

void pop()
{
 if (top==-1)
 {
     printf("\n underflow!! ");
 }
 else
 {
     printf("\n poped element: %d",stack[top]);
     top=top-1;
 }
}

void display()
{
if(top==-1)
{    
printf("\n underflow");
}
else
{
    printf("\n element present in stack: \n");
    for(i=top;i>=0;--i)
        printf("%d\n",stack[i]);

}
}


