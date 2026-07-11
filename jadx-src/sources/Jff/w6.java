package Jff;

import OLt.InterfaceC1421z;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class w6 {
    public static Drawable n(Context context, TypedArray typedArray, int i2) {
        int resourceId = typedArray.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getDrawable(resourceId);
    }

    public static InterfaceC1421z t(TypedArray typedArray, int i2) {
        switch (typedArray.getInt(i2, -2)) {
            case -1:
                return null;
            case 0:
                return InterfaceC1421z.f7396n;
            case 1:
                return InterfaceC1421z.nr;
            case 2:
                return InterfaceC1421z.f7395O;
            case 3:
                return InterfaceC1421z.J2;
            case 4:
                return InterfaceC1421z.Uo;
            case 5:
                return InterfaceC1421z.KN;
            case 6:
                return InterfaceC1421z.xMQ;
            case 7:
                return InterfaceC1421z.mUb;
            case 8:
                return InterfaceC1421z.gh;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01c6 A[PHI: r1 r2 r3
      0x01c6: PHI (r1v18 boolean) = (r1v14 boolean), (r1v20 boolean) binds: [B:131:0x01e4, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r2v13 boolean) = (r2v10 boolean), (r2v15 boolean) binds: [B:131:0x01e4, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]
      0x01c6: PHI (r3v9 boolean) = (r3v6 boolean), (r3v11 boolean) binds: [B:131:0x01e4, B:115:0x01c4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n O(n nVar, Context context, AttributeSet attributeSet) throws Throwable {
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        boolean z6;
        Context context2 = context;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, com.facebook.drawee.j.f52389n);
            try {
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                int integer = 0;
                int i5 = 0;
                boolean z7 = true;
                boolean z9 = true;
                boolean z10 = true;
                boolean z11 = true;
                boolean z12 = true;
                boolean z13 = true;
                boolean z14 = true;
                boolean z15 = true;
                int dimensionPixelSize = 0;
                while (i5 < indexCount) {
                    try {
                        int index = typedArrayObtainStyledAttributes.getIndex(i5);
                        if (index == com.facebook.drawee.j.rl) {
                            nVar.XQ(t(typedArrayObtainStyledAttributes, index));
                        } else if (index == com.facebook.drawee.j.KN) {
                            nVar.te(n(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == com.facebook.drawee.j.mUb) {
                            nVar.fD(n(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == com.facebook.drawee.j.qie) {
                            nVar.E2(n(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == com.facebook.drawee.j.nr) {
                            nVar.aYN(typedArrayObtainStyledAttributes.getInt(index, 0));
                        } else if (index == com.facebook.drawee.j.fD) {
                            nVar.WPU(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                        } else if (index == com.facebook.drawee.j.xMQ) {
                            nVar.iF(t(typedArrayObtainStyledAttributes, index));
                        } else if (index == com.facebook.drawee.j.ty) {
                            nVar.X(n(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == com.facebook.drawee.j.HI) {
                            nVar.T(t(typedArrayObtainStyledAttributes, index));
                        } else if (index == com.facebook.drawee.j.f52383O) {
                            nVar.ViF(n(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == com.facebook.drawee.j.J2) {
                            nVar.nY(t(typedArrayObtainStyledAttributes, index));
                        } else if (index == com.facebook.drawee.j.az) {
                            nVar.e(t(typedArrayObtainStyledAttributes, index));
                        } else if (index == com.facebook.drawee.j.gh) {
                            integer = typedArrayObtainStyledAttributes.getInteger(index, integer);
                        } else if (index == com.facebook.drawee.j.f52392t) {
                            nVar.S(n(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == com.facebook.drawee.j.Uo) {
                            nVar.g(n(context2, typedArrayObtainStyledAttributes, index));
                        } else if (index == com.facebook.drawee.j.ck) {
                            rl(nVar).Ik(typedArrayObtainStyledAttributes.getBoolean(index, false));
                        } else if (index == com.facebook.drawee.j.nY) {
                            dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dimensionPixelSize);
                        } else {
                            int i7 = dimensionPixelSize;
                            if (index == com.facebook.drawee.j.f52384S) {
                                z7 = typedArrayObtainStyledAttributes.getBoolean(index, z7);
                            } else if (index == com.facebook.drawee.j.WPU) {
                                z10 = typedArrayObtainStyledAttributes.getBoolean(index, z10);
                            } else if (index == com.facebook.drawee.j.f52391r) {
                                z14 = typedArrayObtainStyledAttributes.getBoolean(index, z14);
                            } else if (index == com.facebook.drawee.j.f52390o) {
                                z12 = typedArrayObtainStyledAttributes.getBoolean(index, z12);
                            } else if (index == com.facebook.drawee.j.aYN) {
                                z9 = typedArrayObtainStyledAttributes.getBoolean(index, z9);
                            } else if (index == com.facebook.drawee.j.XQ) {
                                z11 = typedArrayObtainStyledAttributes.getBoolean(index, z11);
                            } else if (index == com.facebook.drawee.j.f52386Z) {
                                z15 = typedArrayObtainStyledAttributes.getBoolean(index, z15);
                            } else if (index == com.facebook.drawee.j.Ik) {
                                z13 = typedArrayObtainStyledAttributes.getBoolean(index, z13);
                            } else if (index == com.facebook.drawee.j.ViF) {
                                dimensionPixelSize = i7;
                                rl(nVar).HI(typedArrayObtainStyledAttributes.getColor(index, 0));
                            } else {
                                dimensionPixelSize = i7;
                                if (index == com.facebook.drawee.j.iF) {
                                    rl(nVar).az(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                                } else if (index == com.facebook.drawee.j.f52388g) {
                                    rl(nVar).qie(typedArrayObtainStyledAttributes.getColor(index, 0));
                                } else {
                                    if (index == com.facebook.drawee.j.te) {
                                        rl(nVar).ck(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                                    }
                                    i5++;
                                    context2 = context;
                                }
                            }
                            dimensionPixelSize = i7;
                        }
                        i5++;
                        context2 = context;
                    } catch (Throwable th) {
                        th = th;
                        typedArrayObtainStyledAttributes.recycle();
                        context.getResources().getConfiguration().getLayoutDirection();
                        throw th;
                    }
                }
                boolean z16 = false;
                typedArrayObtainStyledAttributes.recycle();
                if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                    z6 = z7 && z11;
                    z2 = z10 && z9;
                    z3 = z12 && z15;
                    if (z14 && z13) {
                        z16 = true;
                    }
                    z5 = z16;
                    i2 = integer;
                    z4 = z6;
                    i3 = dimensionPixelSize;
                } else {
                    z6 = z7 && z9;
                    z2 = z10 && z11;
                    z3 = z12 && z13;
                    if (z14 && z15) {
                    }
                    z5 = z16;
                    i2 = integer;
                    z4 = z6;
                    i3 = dimensionPixelSize;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            z2 = true;
            i2 = 0;
            z3 = true;
            z4 = true;
            z5 = true;
            i3 = 0;
        }
        if (nVar.ty() != null && i2 > 0) {
            nVar.E2(new OLt.n(nVar.ty(), i2));
        }
        if (i3 > 0) {
            rl(nVar).ty(z4 ? i3 : 0.0f, z2 ? i3 : 0.0f, z3 ? i3 : 0.0f, z5 ? i3 : 0.0f);
        }
        return nVar;
    }

    public static n nr(Context context, AttributeSet attributeSet) {
        if (T5.n.nr()) {
            T5.n.n("GenericDraweeHierarchyBuilder#inflateBuilder");
        }
        n nVarO = O(new n(context.getResources()), context, attributeSet);
        if (T5.n.nr()) {
            T5.n.rl();
        }
        return nVarO;
    }

    private static I28 rl(n nVar) {
        if (nVar.o() == null) {
            nVar.N(new I28());
        }
        return nVar.o();
    }
}
