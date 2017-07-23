package domacnost.paymanager.payment_list;

import android.content.Context;
import android.content.Intent;

import domacnost.paymanager.R;
import domacnost.paymanager.base.BaseActivity;

public class PaymentListActivity extends BaseActivity {

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, PaymentListActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected Integer setActivityLayout() {
        return R.layout.activity_payment_list;
    }

    @Override
    protected boolean enableMenu() {
        return true;
    }
}
