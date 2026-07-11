package v9;

import LQ.j;
import android.content.res.AssetManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class j {
    public static final LQ.j n(AssetManager assetManager, String path) {
        Intrinsics.checkNotNullParameter(assetManager, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            return new j.w6(assetManager.open(path));
        } catch (FileNotFoundException e2) {
            return new j.n(new t2.Ml(e2));
        } catch (IOException e3) {
            return new j.n(new t2.Wre(e3));
        } catch (SecurityException e4) {
            return new j.n(new t2.CN3(e4));
        }
    }
}
