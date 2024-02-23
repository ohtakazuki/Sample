package sample;

class TaxPrice
{
    public static void main (String[] args)
    {
        int subtotal = 899;
        int c_tax = tax(subtotal);
        int total = subtotal + c_tax;
        System.out.println(
            subtotal + "円の商品の税込価格は" +
            total + "円（消費税は" + c_tax + "円）です。"
        );
    }

    public static int tax(int subtotal)
    {
        double rate = 0.1;
        double ret = subtotal * rate;
        return (int)ret;
    }
}