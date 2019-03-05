public class CustomOne implements Observer {
    private final Subject subject;

    //private Subject subject;
    
    public CustomOne(Subject subject){
        this.subject = subject;
    }

    @Override
    public void update() {

        /*//获取 商品名称
        ShopSubject shop = (ShopSubject) subject;
        String goodsName = shop.getGoodsName();
        //double oldPrice = shop.getOldPrice();
        //double newPrice = shop.getNewPrice();

        String info = String.format("第一类人，关心商品%s",goodsName);
        System.out.println(info);*/
        ShopSubject shop = (ShopSubject) subject;
        String goodsName = shop.getGoodsName();

        String info = String.format("第一类人，关心商品%s",goodsName);
        System.out.println(info);

    }
}
