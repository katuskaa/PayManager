package domacnost.paymanager.select_user;

import android.view.View;
import android.widget.Button;

import domacnost.paymanager.R;
import domacnost.paymanager.base.BaseActivity;
import domacnost.paymanager.payment_list.PaymentListActivity;

public class SelectUser extends BaseActivity implements SelectUserHandler {

    @Override
    protected Integer setActivityLayout() {
        return R.layout.activity_select_user;
    }

    @Override
    protected boolean enableMenu() {
        return false;
    }

    @Override
    protected void onActivityLoadingFinished() {
        Button buttonKatusiak = (Button) findViewById(R.id.button_katusiak);
        Button buttonPetusiak = (Button) findViewById(R.id.button_petusiak);

        buttonKatusiak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onSelected();
            }
        });

        buttonPetusiak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onSelected();
            }
        });
    }

    @Override
    public void onSelected() {
        PaymentListActivity.startActivity(this);
        this.finish();
    }
}
