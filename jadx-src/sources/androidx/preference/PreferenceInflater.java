package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class PreferenceInflater {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f40638n;
    private String[] nr;
    private final Object[] rl = new Object[2];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private PreferenceManager f40639t;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Class[] f40637O = {Context.class, AttributeSet.class};
    private static final HashMap J2 = new HashMap();

    private void J2(PreferenceManager preferenceManager) {
        this.f40639t = preferenceManager;
        mUb(new String[]{Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."});
    }

    private PreferenceGroup KN(PreferenceGroup preferenceGroup, PreferenceGroup preferenceGroup2) {
        if (preferenceGroup != null) {
            return preferenceGroup;
        }
        preferenceGroup2.Xw(this.f40639t);
        return preferenceGroup2;
    }

    private Preference n(String str, String[] strArr, AttributeSet attributeSet) throws ClassNotFoundException {
        Class<?> cls;
        Constructor<?> constructor = (Constructor) J2.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f40638n.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        ClassNotFoundException e2 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e3) {
                                e2 = e3;
                            }
                        }
                        if (cls == null) {
                            if (e2 != null) {
                                throw e2;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                    }
                    constructor = cls.getConstructor(f40637O);
                    constructor.setAccessible(true);
                    J2.put(str, constructor);
                } catch (Exception e4) {
                    InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                    inflateException.initCause(e4);
                    throw inflateException;
                }
            } catch (ClassNotFoundException e5) {
                throw e5;
            }
        }
        Object[] objArr = this.rl;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    private Preference rl(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? Uo(str, attributeSet) : n(str, null, attributeSet);
        } catch (InflateException e2) {
            throw e2;
        } catch (ClassNotFoundException e3) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e3);
            throw inflateException;
        } catch (Exception e4) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e4);
            throw inflateException2;
        }
    }

    public Preference O(XmlPullParser xmlPullParser, PreferenceGroup preferenceGroup) {
        int next;
        PreferenceGroup preferenceGroupKN;
        synchronized (this.rl) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.rl[0] = this.f40638n;
            do {
                try {
                    next = xmlPullParser.next();
                    if (next == 2) {
                        break;
                    }
                } catch (InflateException e2) {
                    throw e2;
                } catch (IOException e3) {
                    InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e3.getMessage());
                    inflateException.initCause(e3);
                    throw inflateException;
                } catch (XmlPullParserException e4) {
                    InflateException inflateException2 = new InflateException(e4.getMessage());
                    inflateException2.initCause(e4);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            }
            preferenceGroupKN = KN(preferenceGroup, (PreferenceGroup) rl(xmlPullParser.getName(), attributeSetAsAttributeSet));
            xMQ(xmlPullParser, preferenceGroupKN, attributeSetAsAttributeSet);
        }
        return preferenceGroupKN;
    }

    protected Preference Uo(String str, AttributeSet attributeSet) {
        return n(str, this.nr, attributeSet);
    }

    public void mUb(String[] strArr) {
        this.nr = strArr;
    }

    public Context t() {
        return this.f40638n;
    }

    public PreferenceInflater(Context context, PreferenceManager preferenceManager) {
        this.f40638n = context;
        J2(preferenceManager);
    }

    private static void gh(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                if (next == 3 && xmlPullParser.getDepth() <= depth) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private void xMQ(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if ("intent".equals(name)) {
                        try {
                            preference.ofS(Intent.parseIntent(t().getResources(), xmlPullParser, attributeSet));
                        } catch (IOException e2) {
                            XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException.initCause(e2);
                            throw xmlPullParserException;
                        }
                    } else if ("extra".equals(name)) {
                        t().getResources().parseBundleExtra("extra", attributeSet, preference.gh());
                        try {
                            gh(xmlPullParser);
                        } catch (IOException e3) {
                            XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException2.initCause(e3);
                            throw xmlPullParserException2;
                        }
                    } else {
                        Preference preferenceRl = rl(name, attributeSet);
                        ((PreferenceGroup) preference).EWS(preferenceRl);
                        xMQ(xmlPullParser, preferenceRl, attributeSet);
                    }
                }
            } else {
                return;
            }
        }
    }

    public Preference nr(int i2, PreferenceGroup preferenceGroup) {
        XmlResourceParser xml = t().getResources().getXml(i2);
        try {
            return O(xml, preferenceGroup);
        } finally {
            xml.close();
        }
    }
}
