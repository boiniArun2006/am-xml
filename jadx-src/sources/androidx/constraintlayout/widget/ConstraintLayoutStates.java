package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class ConstraintLayoutStates {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f35954n;
    ConstraintSet rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f35955t = -1;
    int nr = -1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private SparseArray f35953O = new SparseArray();
    private SparseArray J2 = new SparseArray();
    private ConstraintsChangedListener Uo = null;

    static class State {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f35956n;
        ConstraintSet nr;
        ArrayList rl = new ArrayList();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f35957t;

        public int rl(float f3, float f4) {
            for (int i2 = 0; i2 < this.rl.size(); i2++) {
                if (((Variant) this.rl.get(i2)).n(f3, f4)) {
                    return i2;
                }
            }
            return -1;
        }

        void n(Variant variant) {
            this.rl.add(variant);
        }

        State(Context context, XmlPullParser xmlPullParser) {
            this.f35957t = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.xY);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.BUS) {
                    this.f35956n = typedArrayObtainStyledAttributes.getResourceId(index, this.f35956n);
                } else if (index == R.styleable.N4) {
                    this.f35957t = typedArrayObtainStyledAttributes.getResourceId(index, this.f35957t);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f35957t);
                    context.getResources().getResourceName(this.f35957t);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.nr = constraintSet;
                        constraintSet.az(context, this.f35957t);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static class Variant {
        ConstraintSet J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f35958O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        float f35959n;
        float nr;
        float rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        float f35960t;

        boolean n(float f3, float f4) {
            if (!Float.isNaN(this.f35959n) && f3 < this.f35959n) {
                return false;
            }
            if (!Float.isNaN(this.rl) && f4 < this.rl) {
                return false;
            }
            if (Float.isNaN(this.f35960t) || f3 <= this.f35960t) {
                return Float.isNaN(this.nr) || f4 <= this.nr;
            }
            return false;
        }

        Variant(Context context, XmlPullParser xmlPullParser) {
            this.f35959n = Float.NaN;
            this.rl = Float.NaN;
            this.f35960t = Float.NaN;
            this.nr = Float.NaN;
            this.f35958O = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.bG);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == R.styleable.Ieo) {
                    this.f35958O = typedArrayObtainStyledAttributes.getResourceId(index, this.f35958O);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f35958O);
                    context.getResources().getResourceName(this.f35958O);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.J2 = constraintSet;
                        constraintSet.az(context, this.f35958O);
                    }
                } else if (index == R.styleable.Oa) {
                    this.nr = typedArrayObtainStyledAttributes.getDimension(index, this.nr);
                } else if (index == R.styleable.EpR) {
                    this.rl = typedArrayObtainStyledAttributes.getDimension(index, this.rl);
                } else if (index == R.styleable.Zh) {
                    this.f35960t = typedArrayObtainStyledAttributes.getDimension(index, this.f35960t);
                } else if (index == R.styleable.a85) {
                    this.f35959n = typedArrayObtainStyledAttributes.getDimension(index, this.f35959n);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void n(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            int eventType = xml.getEventType();
            State state = null;
            while (true) {
                byte b2 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            b2 = !name.equals("ConstraintSet") ? (byte) -1 : (byte) 4;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                b2 = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                b2 = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b2 = 3;
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                    if (b2 == 2) {
                        State state2 = new State(context, xml);
                        this.f35953O.put(state2.f35956n, state2);
                        state = state2;
                    } else if (b2 == 3) {
                        Variant variant = new Variant(context, xml);
                        if (state != null) {
                            state.n(variant);
                        }
                    } else if (b2 == 4) {
                        rl(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i2, e2);
        } catch (XmlPullParserException e3) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i2, e3);
        }
    }

    private void rl(Context context, XmlPullParser xmlPullParser) {
        ConstraintSet constraintSet = new ConstraintSet();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                constraintSet.te(context, xmlPullParser);
                this.J2.put(identifier, constraintSet);
                return;
            }
        }
    }

    public void nr(int i2, float f3, float f4) {
        int iRl;
        int i3 = this.f35955t;
        if (i3 == i2) {
            State state = i2 == -1 ? (State) this.f35953O.valueAt(0) : (State) this.f35953O.get(i3);
            int i5 = this.nr;
            if ((i5 == -1 || !((Variant) state.rl.get(i5)).n(f3, f4)) && this.nr != (iRl = state.rl(f3, f4))) {
                ConstraintSet constraintSet = iRl == -1 ? this.rl : ((Variant) state.rl.get(iRl)).J2;
                int i7 = iRl == -1 ? state.f35957t : ((Variant) state.rl.get(iRl)).f35958O;
                if (constraintSet == null) {
                    return;
                }
                this.nr = iRl;
                ConstraintsChangedListener constraintsChangedListener = this.Uo;
                if (constraintsChangedListener != null) {
                    constraintsChangedListener.rl(-1, i7);
                }
                constraintSet.xMQ(this.f35954n);
                ConstraintsChangedListener constraintsChangedListener2 = this.Uo;
                if (constraintsChangedListener2 != null) {
                    constraintsChangedListener2.n(-1, i7);
                    return;
                }
                return;
            }
            return;
        }
        this.f35955t = i2;
        State state2 = (State) this.f35953O.get(i2);
        int iRl2 = state2.rl(f3, f4);
        ConstraintSet constraintSet2 = iRl2 == -1 ? state2.nr : ((Variant) state2.rl.get(iRl2)).J2;
        int i8 = iRl2 == -1 ? state2.f35957t : ((Variant) state2.rl.get(iRl2)).f35958O;
        if (constraintSet2 == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i2 + ", dim =" + f3 + ", " + f4);
            return;
        }
        this.nr = iRl2;
        ConstraintsChangedListener constraintsChangedListener3 = this.Uo;
        if (constraintsChangedListener3 != null) {
            constraintsChangedListener3.rl(i2, i8);
        }
        constraintSet2.xMQ(this.f35954n);
        ConstraintsChangedListener constraintsChangedListener4 = this.Uo;
        if (constraintsChangedListener4 != null) {
            constraintsChangedListener4.n(i2, i8);
        }
    }

    public void t(ConstraintsChangedListener constraintsChangedListener) {
        this.Uo = constraintsChangedListener;
    }

    ConstraintLayoutStates(Context context, ConstraintLayout constraintLayout, int i2) {
        this.f35954n = constraintLayout;
        n(context, i2);
    }
}
