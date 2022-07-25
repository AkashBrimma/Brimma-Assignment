public class seven {
public static void main(String[] args) {
final int n = 10001;
int numPrimes = 1, num = 1;
while (numPrimes &lt; n) {
num += 2;
numPrimes += (isPrime(num)) ? 1 : 0;
}
System.out.println(num);
}

public static boolean isPrime(int num) {
for (int i = 3; i &lt;= Math.sqrt(num); i += 2) {
if (num % i == 0)
return false;
}
return true;
}
}
