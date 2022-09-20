/* Menu Driven C Program to implement queue using array */

#include<stdio.h>
#include<stdlib.h>
#define MAX 10

int queue_arr[MAX];
int rear=-1;
int front=-1;

void load(){
    FILE *fp;
    char ch;
    int i=0;
    fp=fopen("queue.txt","r");
    if(fp==NULL){
        printf("Error in opening file");
    }
    while((ch=fgetc(fp))!=EOF){
        queue_arr[i]=ch;
        i++;
    }
    fclose(fp);
}

void save (){
    FILE *fp;
    int i;
    fp=fopen("queue.txt","w");
    if(fp==NULL){
        printf("Error in opening file");
    }
    for(i=front;i<=rear;i++){
        fputc(queue_arr[i],fp);
    }
    fclose(fp);
}


int isEmpty()
{
    if(front==-1 || front==rear+1)
        return 1;
    else
        return 0;
}

int isFull()
{
    if(rear==MAX-1)
        return 1;
    else
        return 0;
}

void display() {
    int i;
    if (isEmpty()) {
        printf("\nQueue is empty\n");
        return;
    }
    printf("\nQueue is :\n\n");
    for (i = front; i <= rear; i++)
        printf("%d  ", queue_arr[i]);
    printf("\n\n");
}

void insert(int item)
{
    if(isFull())
    {
        printf("Queue Overflow \n");
        return;
    }
    if(front==-1)
        front=0;
    rear=rear+1;
    queue_arr[rear]=item;
}


int del()
{
    int item;
    if(isEmpty())
    {
        printf("Queue Underflow \n");
        exit(1);
    }
    item=queue_arr[front];
    front=front+1;
    return item;
}


int search(int item)
{
    int i;
    for(i=front;i<=rear;i++)
    {
        if(queue_arr[i]==item)
        {
            printf("Element found at position %d",i+1);
            return 1;
        }
    }
    printf("Element not found");
    return 0;
}


void sort()
{
    int i,j,temp;
    for(i=front;i<=rear;i++)
    {
        for(j=i+1;j<=rear;j++)
        {
            if(queue_arr[i]>queue_arr[j])
            {
                temp=queue_arr[i];
                queue_arr[i]=queue_arr[j];
                queue_arr[j]=temp;
            }
        }
    }
}


void sort_desc()
{
    int i,j,temp;
    for(i=front;i<=rear;i++)
    {
        for(j=i+1;j<=rear;j++)
        {
            if(queue_arr[i]<queue_arr[j])
            {
                temp=queue_arr[i];
                queue_arr[i]=queue_arr[j];
                queue_arr[j]=temp;
            }
        }
    }
}


void priority_queue(int item)
{
    int i;
    if(isFull())
    {
        printf("Queue Overflow \n");
        return;
    }
    if(front==-1)
        front=0;
    if(rear==-1)
    {
        rear=0;
        queue_arr[rear]=item;
    }
    else
    {
        for(i=rear;i>=front;i--)
        {
            if(item>queue_arr[i])
                queue_arr[i+1]=queue_arr[i];
            else
                break;
        }
        queue_arr[i+1]=item;
        rear=rear+1;
    }
}


void circular_queue(int item)
{
    if(isFull())
    {
        printf("Queue Overflow \n");
        return;
    }
    if(front==-1)
        front=0;
    if(rear==MAX-1)
        rear=0;
    else
        rear=rear+1;
    queue_arr[rear]=item;
}


int main (){

    int choice,item;

    printf("Do you want to read data from a file (Y/N) : ");
    char ch;
    scanf("%c",&ch);

    if (ch=='Y' || ch=='y'){
        load();
    }

    while(true){
        printf("\n1.Queue\n");
        printf("2.Dequeue\n");
        printf("3.Search\n");
        printf("4.Sort\n");
        printf("5.Sort reverse\n");
        printf("6.Priority Queue\n");
        printf("7.Circular Queue\n");
        printf("8.Display\n");
        printf("9.Save\n");
        printf("\nEnter your choice : ");
        scanf("%d",&choice);
        switch(choice){
            case 1:
                printf("Input the element for insertion in queue : ");
                scanf("%d",&item);
                insert(item);
                break;
            case 2:
                printf("Element deleted from queue is : %d\n",del());
                break;
            case 3:
                printf("Input the element for search in queue : ");
                scanf("%d",&item);
                search(item);
                break;
            case 4:
                sort();
                printf("Queue after sorting is : ");
                display();
                break;
            case 5:
                sort_desc();
                printf("Queue after sorting is : ");
                display();
                break;
            case 6:
                printf("Input the element for insertion in queue : ");
                scanf("%d",&item);
                priority_queue(item);
                break;
            case 7:
                printf("Input the element for insertion in queue : ");
                scanf("%d",&item);
                circular_queue(item);
                break;
            case 8:
                display();
                break;
            case 9:
                save();
                break;
            default:
                printf("Wrong choice \n");
        }

            
    }
    
}