package Vk7;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final w6 f11282n = new w6();

    public static final boolean J2(String text, String rule) {
        if (VmF.j.nr(w6.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(rule, "rule");
            return new Regex(rule).matches(text);
        } catch (Throwable th) {
            VmF.j.rl(th, w6.class);
            return false;
        }
    }

    public static final boolean O(List indicators, List keys) {
        if (VmF.j.nr(w6.class)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(indicators, "indicators");
            Intrinsics.checkNotNullParameter(keys, "keys");
            Iterator it = indicators.iterator();
            while (it.hasNext()) {
                if (f11282n.nr((String) it.next(), keys)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            VmF.j.rl(th, w6.class);
            return false;
        }
    }

    public static final List n(View view) {
        if (VmF.j.nr(w6.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList arrayList = new ArrayList();
            ViewGroup viewGroupMUb = Zfb.Wre.mUb(view);
            if (viewGroupMUb != null) {
                for (View view2 : Zfb.Wre.rl(viewGroupMUb)) {
                    if (view != view2) {
                        arrayList.addAll(f11282n.t(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            VmF.j.rl(th, w6.class);
            return null;
        }
    }

    public static final List rl(View view) {
        if (VmF.j.nr(w6.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(Zfb.Wre.xMQ(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String resourceName = view.getResources().getResourceName(view.getId());
                    Intrinsics.checkNotNullExpressionValue(resourceName, "resourceName");
                    String[] strArr = (String[]) new Regex("/").split(resourceName, 0).toArray(new String[0]);
                    if (strArr.length == 2) {
                        arrayList.add(strArr[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if (str.length() > 0 && str.length() <= 100) {
                    String lowerCase = str.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                    arrayList2.add(lowerCase);
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            VmF.j.rl(th, w6.class);
            return null;
        }
    }

    private w6() {
    }

    private final boolean nr(String str, List list) {
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.contains$default((CharSequence) str, (CharSequence) it.next(), false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }

    private final List t(View view) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String string = ((TextView) view).getText().toString();
                if (string.length() > 0 && string.length() < 100) {
                    String lowerCase = string.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                    arrayList.add(lowerCase);
                    return arrayList;
                }
            } else {
                Iterator it = Zfb.Wre.rl(view).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(t((View) it.next()));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }
}
