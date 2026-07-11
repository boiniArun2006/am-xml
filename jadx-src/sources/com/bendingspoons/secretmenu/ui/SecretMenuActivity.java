package com.bendingspoons.secretmenu.ui;

import Rxk.C;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import bH.Ml;
import com.bendingspoons.secretmenu.ui.mainscreen.Dsr;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/bendingspoons/secretmenu/ui/SecretMenuActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "secretmenu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SecretMenuActivity extends AppCompatActivity {
    public SecretMenuActivity() {
        super(Ml.f43237n);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(C.Uo);
        super.onCreate(savedInstanceState);
        if (Dsr.rl.n() == null) {
            finish();
        }
    }
}
