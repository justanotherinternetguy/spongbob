import java.io.*;
import java.util.*;

public int total = 0;
public int truckAmount = 0;
public int rentedTrucks = 0;
public class Money
{

}
public void buyTruck(int count)
{
    total += 100000*count;
    truckAmount += count;
}
public void rentTruck(int count)
{
    total += 15000*count;
    truckAmount += count;
    rentedTrucks += count;
}
public void maintainance(int count)
{
    total += 1000*count;
}
public void fuel(int count)
{
    total += 5*count;
}
public void wages(int hours)
{
    if(hours <= 8)
    {
        total += 30*hours;
    }
    else
    {
        total += 240+((hours-8)*45);
    }
}
public void newDay
{
    truckAmount-=rentedTrucks;
    rentedTrucks=0;
}