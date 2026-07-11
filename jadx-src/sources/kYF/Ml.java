package kYF;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.view.Lifecycle;
import androidx.view.LifecycleOwner;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Ml {
    public static final Lifecycle t(Context context) {
        Object baseContext = context;
        while (!(baseContext instanceof LifecycleOwner)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return ((LifecycleOwner) baseContext).getLifecycle();
    }

    public static final boolean O(Context context, String str) {
        if (ContextCompat.checkSelfPermission(context, str) == 0) {
            return true;
        }
        return false;
    }

    public static final Drawable n(Context context, int i2) {
        Drawable drawableRl = AppCompatResources.rl(context, i2);
        if (drawableRl != null) {
            return drawableRl;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i2).toString());
    }

    public static final Drawable nr(Context context, Resources resources, int i2) throws XmlPullParserException, IOException {
        XmlResourceParser xml = resources.getXml(i2);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            return rl(resources, i2, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    public static final Drawable rl(Resources resources, int i2, Resources.Theme theme) {
        Drawable drawableJ2 = ResourcesCompat.J2(resources, i2, theme);
        if (drawableJ2 != null) {
            return drawableJ2;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i2).toString());
    }
}
