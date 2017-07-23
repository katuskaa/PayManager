package domacnost.paymanager.screens.shopping_list;

import android.content.Context;
import android.content.Intent;

import domacnost.paymanager.R;
import domacnost.paymanager.base.BaseActivity;

public class ShoppingListActivity extends BaseActivity implements ShoppingListHandler {

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, ShoppingListActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected Integer setActivityLayout() {
        return R.layout.activity_shopping_list;
    }

    @Override
    protected boolean enableMenu() {
        return true;
    }

    @Override
    protected void onActivityLoadingFinished() {

    }

//    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show();
//        }
//    });


}
