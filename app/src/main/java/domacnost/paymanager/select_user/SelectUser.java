package domacnost.paymanager.select_user;

import android.content.Context;
import android.content.Intent;

import domacnost.paymanager.R;
import domacnost.paymanager.base.BaseActivity;

public class SelectUser extends BaseActivity {

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, SelectUser.class);
        context.startActivity(intent);
    }

    @Override
    protected Integer setActivityLayout() {
        return R.layout.activity_select_user;
    }

    @Override
    protected boolean enableMenu() {
        return false;
    }
}
