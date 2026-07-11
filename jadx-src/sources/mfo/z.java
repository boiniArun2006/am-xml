package mfo;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
class z extends Xo {

    class j extends ViewOutlineProvider {
        j() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (z.this.f70926O.isEmpty()) {
                return;
            }
            outline.setPath(z.this.f70926O);
        }
    }

    @DoNotInline
    private void gh(View view) {
        view.setOutlineProvider(new j());
    }

    @Override // mfo.Xo
    boolean xMQ() {
        return this.f70927n;
    }

    z(View view) {
        gh(view);
    }

    @Override // mfo.Xo
    void rl(View view) {
        view.setClipToOutline(!xMQ());
        if (xMQ()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }
}
