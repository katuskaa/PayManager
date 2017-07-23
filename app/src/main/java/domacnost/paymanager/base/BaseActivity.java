package domacnost.paymanager.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import domacnost.paymanager.R;
import domacnost.paymanager.payment_list.PaymentListActivity;
import domacnost.paymanager.shopping_list.ShoppingListActivity;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setActivityLayout());

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_payment_list) {
            PaymentListActivity.startActivity(this);
            return true;

        } else if (id == R.id.action_shopping_list) {
            ShoppingListActivity.startActivity(this);
            return true;

        }
        return super.onOptionsItemSelected(item);
    }

    protected abstract Integer setActivityLayout();
}
