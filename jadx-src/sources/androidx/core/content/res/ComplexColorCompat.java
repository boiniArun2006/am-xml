package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.RestrictTo;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public final class ComplexColorCompat {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Shader f36358n;
    private final ColorStateList rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f36359t;

    static ComplexColorCompat nr(Shader shader) {
        return new ComplexColorCompat(shader, null, 0);
    }

    static ComplexColorCompat rl(int i2) {
        return new ComplexColorCompat(null, null, i2);
    }

    static ComplexColorCompat t(ColorStateList colorStateList) {
        return new ComplexColorCompat(null, colorStateList, colorStateList.getDefaultColor());
    }

    public Shader J2() {
        return this.f36358n;
    }

    public boolean KN() {
        return this.f36358n != null;
    }

    public int O() {
        return this.f36359t;
    }

    public void gh(int i2) {
        this.f36359t = i2;
    }

    public boolean xMQ() {
        ColorStateList colorStateList;
        return this.f36358n == null && (colorStateList = this.rl) != null && colorStateList.isStateful();
    }

    private ComplexColorCompat(Shader shader, ColorStateList colorStateList, int i2) {
        this.f36358n = shader;
        this.rl = colorStateList;
        this.f36359t = i2;
    }

    public static ComplexColorCompat Uo(Resources resources, int i2, Resources.Theme theme) {
        try {
            return n(resources, i2, theme);
        } catch (Exception e2) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
            return null;
        }
    }

    private static ComplexColorCompat n(Resources resources, int i2, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i2);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.getClass();
            if (!name.equals("gradient")) {
                if (name.equals("selector")) {
                    return t(ColorStateListInflaterCompat.rl(resources, xml, attributeSetAsAttributeSet, theme));
                }
                throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
            }
            return nr(GradientColorInflaterCompat.rl(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException("No start tag found");
    }

    public boolean mUb(int[] iArr) {
        if (xMQ()) {
            ColorStateList colorStateList = this.rl;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f36359t) {
                this.f36359t = colorForState;
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean qie() {
        if (!KN() && this.f36359t == 0) {
            return false;
        }
        return true;
    }
}
