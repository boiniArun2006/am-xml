package com.alightcreative.app.motion.activities;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/alightcreative/app/motion/activities/DevSettingsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "LSJ0/Ml;", "r", "LSJ0/Ml;", "binding", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DevSettingsActivity extends XBq {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private SJ0.Ml binding;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ofS(DevSettingsActivity devSettingsActivity, View view) {
        devSettingsActivity.finish();
    }

    @Override // com.alightcreative.app.motion.activities.XBq, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SJ0.Ml mlT = SJ0.Ml.t(getLayoutInflater());
        this.binding = mlT;
        SJ0.Ml ml = null;
        if (mlT == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            mlT = null;
        }
        setContentView(mlT.getRoot());
        SJ0.Ml ml2 = this.binding;
        if (ml2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ml2 = null;
        }
        ml2.rl.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.c7r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DevSettingsActivity.ofS(this.f44923n, view);
            }
        });
        FragmentTransaction fragmentTransactionO = getSupportFragmentManager().o();
        SJ0.Ml ml3 = this.binding;
        if (ml3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ml = ml3;
        }
        fragmentTransactionO.o(ml.f9228O.getId(), new qHw.vd()).mUb();
    }
}
