package com.bendingspoons.injet.ui;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import kP.AbstractC2208fuX;
import kP.EnumC2205I28;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/bendingspoons/injet/ui/InjetClearBackgroundPresenterActivity;", "Lcom/bendingspoons/injet/ui/InjetPresenterActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "injet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InjetClearBackgroundPresenterActivity extends InjetPresenterActivity {

    public /* synthetic */ class j {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC2205I28.values().length];
            try {
                iArr[EnumC2205I28.f69847n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2205I28.f69850t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2205I28.f69849r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC2205I28.f69845O.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC2205I28.J2.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.bendingspoons.injet.ui.InjetPresenterActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        int i2 = j.$EnumSwitchMapping$0[InjetPresenterActivity.INSTANCE.nr().ordinal()];
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            if (i2 == 4) {
                setTheme(AbstractC2208fuX.f69853t);
            } else {
                if (i2 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                setTheme(AbstractC2208fuX.nr);
            }
        }
        super.onCreate(savedInstanceState);
    }
}
