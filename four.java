public class four {
public static void main(String[] args) {
int max = -1;
for (int i = 999; i >= 100; i--) {
for (int j = 999; j >= 100; j--) {
int p = i * j;
if (max < p && isPalindrome(p)) {
max = p;
}
}
}
System.out.println(max > -1 ? max : "No palindrome found");
}

public static boolean isPalindrome(int nr) {
int rev = 0;
int x = nr;
while (x > 0) {
rev = 10 * rev + x % 10;
x /= 10;
}
return nr == rev;
}
}
