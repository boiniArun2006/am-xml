package androidx.compose.foundation.internal;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\bJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010\u0017J\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020#ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010\u001aJ\u0013\u0010&\u001a\u00020%ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010\u001aJ\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u0013\u0010+\u001a\u00020*ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010\u0017J\u0013\u0010-\u001a\u00020,ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010\u0017R\u0014\u00100\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010/\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Landroidx/compose/foundation/internal/DecodeHelper;", "", "", "string", "<init>", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/style/BaselineShift;", "rl", "()F", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "ty", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "Landroidx/compose/ui/text/style/TextDecoration;", "az", "()Landroidx/compose/ui/text/style/TextDecoration;", "Landroidx/compose/ui/graphics/Shadow;", "mUb", "()Landroidx/compose/ui/graphics/Shadow;", "", "t", "()B", "", "xMQ", "()I", "Lkotlin/ULong;", "ck", "()J", "", "O", "qie", "()Ljava/lang/String;", c.f62177j, "Landroidx/compose/ui/text/SpanStyle;", "gh", "()Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/graphics/Color;", "nr", "Landroidx/compose/ui/unit/TextUnit;", "HI", "Landroidx/compose/ui/text/font/FontWeight;", "KN", "()Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "J2", "Landroidx/compose/ui/text/font/FontSynthesis;", "Uo", "Landroid/os/Parcel;", "Landroid/os/Parcel;", "parcel", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nClipboardUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipboardUtils.android.kt\nandroidx/compose/foundation/internal/DecodeHelper\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,556:1\n30#2:557\n53#3,3:558\n*S KotlinDebug\n*F\n+ 1 ClipboardUtils.android.kt\nandroidx/compose/foundation/internal/DecodeHelper\n*L\n450#1:557\n450#1:558,3\n*E\n"})
public final class DecodeHelper {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Parcel parcel;

    private final float O() {
        return this.parcel.readFloat();
    }

    private final long ck() {
        return ULong.m487constructorimpl(this.parcel.readLong());
    }

    private final Shadow mUb() {
        long jNr = nr();
        float fO = O();
        return new Shadow(jNr, Offset.O((((long) Float.floatToRawIntBits(O())) & 4294967295L) | (Float.floatToRawIntBits(fO) << 32)), O(), null);
    }

    private final int n() {
        return this.parcel.dataAvail();
    }

    private final String qie() {
        return this.parcel.readString();
    }

    private final byte t() {
        return this.parcel.readByte();
    }

    private final TextGeometricTransform ty() {
        return new TextGeometricTransform(O(), O());
    }

    private final int xMQ() {
        return this.parcel.readInt();
    }

    public final FontWeight KN() {
        return new FontWeight(xMQ());
    }

    public final SpanStyle gh() {
        MutableSpanStyle mutableSpanStyle = new MutableSpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.parcel.dataAvail() > 1) {
            byte bT = t();
            if (bT != 1) {
                if (bT != 2) {
                    if (bT != 3) {
                        if (bT != 4) {
                            if (bT != 5) {
                                if (bT != 6) {
                                    if (bT != 7) {
                                        if (bT != 8) {
                                            if (bT != 9) {
                                                if (bT != 10) {
                                                    if (bT != 11) {
                                                        if (bT == 12) {
                                                            if (n() < 20) {
                                                                break;
                                                            }
                                                            mutableSpanStyle.mUb(mUb());
                                                        } else {
                                                            continue;
                                                        }
                                                    } else {
                                                        if (n() < 4) {
                                                            break;
                                                        }
                                                        mutableSpanStyle.gh(az());
                                                    }
                                                } else {
                                                    if (n() < 8) {
                                                        break;
                                                    }
                                                    mutableSpanStyle.n(nr());
                                                }
                                            } else {
                                                if (n() < 8) {
                                                    break;
                                                }
                                                mutableSpanStyle.qie(ty());
                                            }
                                        } else {
                                            if (n() < 4) {
                                                break;
                                            }
                                            mutableSpanStyle.rl(BaselineShift.rl(rl()));
                                        }
                                    } else {
                                        if (n() < 5) {
                                            break;
                                        }
                                        mutableSpanStyle.xMQ(HI());
                                    }
                                } else {
                                    mutableSpanStyle.nr(qie());
                                }
                            } else {
                                if (n() < 1) {
                                    break;
                                }
                                mutableSpanStyle.Uo(FontSynthesis.O(Uo()));
                            }
                        } else {
                            if (n() < 1) {
                                break;
                            }
                            mutableSpanStyle.J2(FontStyle.t(J2()));
                        }
                    } else {
                        if (n() < 4) {
                            break;
                        }
                        mutableSpanStyle.KN(KN());
                    }
                } else {
                    if (n() < 5) {
                        break;
                    }
                    mutableSpanStyle.O(HI());
                }
            } else {
                if (n() < 8) {
                    break;
                }
                mutableSpanStyle.t(nr());
            }
        }
        return mutableSpanStyle.az();
    }

    public DecodeHelper(String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.parcel = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    private final TextDecoration az() {
        boolean z2;
        int iXMQ = xMQ();
        TextDecoration.Companion companion = TextDecoration.INSTANCE;
        boolean z3 = false;
        if ((companion.rl().getMask() & iXMQ) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((iXMQ & companion.nr().getMask()) != 0) {
            z3 = true;
        }
        if (z2 && z3) {
            return companion.n(CollectionsKt.listOf((Object[]) new TextDecoration[]{companion.rl(), companion.nr()}));
        }
        if (z2) {
            return companion.rl();
        }
        if (z3) {
            return companion.nr();
        }
        return companion.t();
    }

    private final float rl() {
        return BaselineShift.t(O());
    }

    public final long HI() {
        long jT2;
        byte bT = t();
        if (bT == 1) {
            jT2 = TextUnitType.INSTANCE.rl();
        } else if (bT == 2) {
            jT2 = TextUnitType.INSTANCE.n();
        } else {
            jT2 = TextUnitType.INSTANCE.t();
        }
        if (TextUnitType.Uo(jT2, TextUnitType.INSTANCE.t())) {
            return TextUnit.INSTANCE.n();
        }
        return TextUnitKt.n(O(), jT2);
    }

    public final int J2() {
        byte bT = t();
        if (bT == 0) {
            return FontStyle.INSTANCE.rl();
        }
        if (bT == 1) {
            return FontStyle.INSTANCE.n();
        }
        return FontStyle.INSTANCE.rl();
    }

    public final int Uo() {
        byte bT = t();
        if (bT == 0) {
            return FontSynthesis.INSTANCE.rl();
        }
        if (bT == 1) {
            return FontSynthesis.INSTANCE.n();
        }
        if (bT == 3) {
            return FontSynthesis.INSTANCE.t();
        }
        if (bT == 2) {
            return FontSynthesis.INSTANCE.nr();
        }
        return FontSynthesis.INSTANCE.rl();
    }

    public final long nr() {
        return Color.mUb(ck());
    }
}
