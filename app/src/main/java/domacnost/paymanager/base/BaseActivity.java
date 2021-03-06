package domacnost.paymanager.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import domacnost.paymanager.R;
import domacnost.paymanager.screens.payment_list.PaymentListActivity;
import domacnost.paymanager.screens.shopping_list.ShoppingListActivity;

public abstract class BaseActivity extends AppCompatActivity {

    private static BaseActivity baseActivity;
    private boolean enabledMenu;

    public static BaseActivity getInstance() {
        return baseActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setActivityLayout());

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        baseActivity = this;

        this.enabledMenu = enableMenu();
        this.onActivityLoadingFinished();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.enabledMenu) {
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_payment_list) {
            PaymentListActivity.startActivity(this);
            this.finish();
            return true;

        } else if (id == R.id.action_shopping_list) {
            ShoppingListActivity.startActivity(this);
            this.finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    protected abstract Integer setActivityLayout();

    protected abstract boolean enableMenu();

    protected abstract void onActivityLoadingFinished();
}
