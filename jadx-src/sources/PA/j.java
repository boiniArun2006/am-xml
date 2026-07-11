package PA;

import com.caoccao.javet.values.primitive.V8ValueNull;
import java.util.Iterator;
import kotlin.text.Typography;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class j implements w6 {
    protected abstract void O(String str);

    protected abstract void nr(char c2);

    private w6 Uo(String str, String str2, String str3, Iterator it) {
        return J2(str, str2, str3, new PF.w6(it));
    }

    private void mUb(String str) {
        nr(Typography.quote);
        for (int i2 = 0; i2 < str.length(); i2++) {
            xMQ(str.charAt(i2));
        }
        nr(Typography.quote);
    }

    private void xMQ(char c2) {
        if (c2 == '\t') {
            O("\\t");
            return;
        }
        if (c2 == '\n') {
            O("\\n");
            return;
        }
        if (c2 == '\r') {
            O("\\r");
        } else if (c2 != '\"') {
            nr(c2);
        } else {
            O("\\\"");
        }
    }

    @Override // PA.w6
    public w6 rl(Object obj) {
        if (obj == null) {
            O(V8ValueNull.NULL);
            return this;
        }
        if (obj instanceof String) {
            mUb((String) obj);
            return this;
        }
        if (obj instanceof Character) {
            nr(Typography.quote);
            xMQ(((Character) obj).charValue());
            nr(Typography.quote);
            return this;
        }
        if (obj instanceof Short) {
            nr(Typography.less);
            O(KN(obj));
            O("s>");
            return this;
        }
        if (obj instanceof Long) {
            nr(Typography.less);
            O(KN(obj));
            O("L>");
            return this;
        }
        if (obj instanceof Float) {
            nr(Typography.less);
            O(KN(obj));
            O("F>");
            return this;
        }
        if (obj.getClass().isArray()) {
            Uo("[", ", ", "]", new PF.j(obj));
            return this;
        }
        nr(Typography.less);
        O(KN(obj));
        nr(Typography.greater);
        return this;
    }

    private w6 J2(String str, String str2, String str3, Iterator it) {
        O(str);
        boolean z2 = false;
        while (it.hasNext()) {
            if (z2) {
                O(str2);
            }
            t((I28) it.next());
            z2 = true;
        }
        O(str3);
        return this;
    }

    private String KN(Object obj) {
        try {
            return String.valueOf(obj);
        } catch (Exception unused) {
            return obj.getClass().getName() + "@" + Integer.toHexString(obj.hashCode());
        }
    }

    @Override // PA.w6
    public w6 n(String str) {
        O(str);
        return this;
    }

    @Override // PA.w6
    public w6 t(I28 i28) {
        i28.n(this);
        return this;
    }
}
