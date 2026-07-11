package com.alightcreative.app.motion.activities;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/alightcreative/app/motion/activities/SettingsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "LSJ0/ci;", "r", "LSJ0/ci;", "binding", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SettingsActivity extends Lzz {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private SJ0.ci binding;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ofS(SettingsActivity settingsActivity, View view) {
        settingsActivity.finish();
    }

    @Override // com.alightcreative.app.motion.activities.Lzz, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SJ0.ci ciVarT = SJ0.ci.t(getLayoutInflater());
        this.binding = ciVarT;
        SJ0.ci ciVar = null;
        if (ciVarT == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ciVarT = null;
        }
        setContentView(ciVarT.getRoot());
        SJ0.ci ciVar2 = this.binding;
        if (ciVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            ciVar2 = null;
        }
        ciVar2.rl.setOnClickListener(new View.OnClickListener() { // from class: com.alightcreative.app.motion.activities.x6K
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingsActivity.ofS(this.f45723n, view);
            }
        });
        FragmentTransaction fragmentTransactionO = getSupportFragmentManager().o();
        SJ0.ci ciVar3 = this.binding;
        if (ciVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            ciVar = ciVar3;
        }
        fragmentTransactionO.o(ciVar.f9423O.getId(), new qHw.Md()).mUb();
    }
}
