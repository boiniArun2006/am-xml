package QG7;

import android.graphics.drawable.Drawable;
import bA.InterfaceC1654CN3;
import bA.InterfaceC1656I28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j implements ypp.j {
    @Override // ypp.j
    public Drawable n(InterfaceC1656I28 image) {
        Intrinsics.checkNotNullParameter(image, "image");
        InterfaceC1654CN3 interfaceC1654CN3 = image instanceof InterfaceC1654CN3 ? (InterfaceC1654CN3) image : null;
        if (interfaceC1654CN3 != null) {
            return interfaceC1654CN3.G7();
        }
        return null;
    }

    @Override // ypp.j
    public boolean rl(InterfaceC1656I28 image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof InterfaceC1654CN3;
    }
}
