package com.firebase.ui.auth.util.ui;

import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import com.firebase.ui.auth.util.ui.ImeHelper;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RestrictTo
public abstract class ImeHelper {

    @RestrictTo
    public interface DonePressedListener {
        void onDonePressed();
    }

    public static /* synthetic */ boolean n(DonePressedListener donePressedListener, TextView textView, int i2, KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 66) {
            if (keyEvent.getAction() == 1) {
                donePressedListener.onDonePressed();
            }
            return true;
        }
        if (i2 != 6) {
            return false;
        }
        donePressedListener.onDonePressed();
        return true;
    }

    public static void setImeOnDoneListener(EditText editText, final DonePressedListener donePressedListener) {
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: TXU.j
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return ImeHelper.n(donePressedListener, textView, i2, keyEvent);
            }
        });
    }
}
