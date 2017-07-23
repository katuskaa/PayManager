package domacnost.paymanager.login;

import android.content.Context;
import android.content.Intent;

import domacnost.paymanager.R;
import domacnost.paymanager.base.BaseActivity;

public class LoginActivity extends BaseActivity {

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected Integer setActivityLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected boolean enableMenu() {
        return false;
    }
}
