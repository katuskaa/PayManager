package domacnost.paymanager.communication;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import domacnost.paymanager.communication.collections.Item;
import domacnost.paymanager.communication.collections.Payment;
import domacnost.paymanager.helpers.SharedPreferencesHelper;

public class Database {

    public static void goOffline() {
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }

    public static void addPayment(String date, int sum, String shop) {
        Payment payment = new Payment();
        payment.setSum(sum);
        payment.setDate(date);
        payment.setShop(shop);
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference(SharedPreferencesHelper.getUser()).push();
        databaseReference.setValue(payment);
    }

    public static void addItem(String name, int count) {
        Item item = new Item();
        item.setName(name);
        item.setCount(count);
        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference(FirebaseKey.SHOPPINGS).push();
        databaseReference.setValue(item);
    }
}
