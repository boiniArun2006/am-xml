package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@LayoutScopeMarker
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b)\b\u0007\u0018\u00002\u00020\u0001:\u0006\u0084\u0001\u0085\u0001\u0086\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001f\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010!\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b\u000f\u0010\u0017R\u0017\u0010$\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\"\u0010\u0015\u001a\u0004\b#\u0010\u0017R\u0017\u0010&\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b\u0007\u0010\u001eR\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R+\u00104\u001a\u00020-2\u0006\u0010.\u001a\u00020-8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b\"\u00103R+\u00107\u001a\u00020-2\u0006\u0010.\u001a\u00020-8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b5\u00100\u001a\u0004\b6\u00102\"\u0004\b \u00103R+\u0010?\u001a\u0002082\u0006\u0010.\u001a\u0002088F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R*\u0010H\u001a\u00020@2\u0006\u0010A\u001a\u00020@8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR+\u0010M\u001a\u00020@2\u0006\u0010.\u001a\u00020@8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010E\"\u0004\bL\u0010GR+\u0010Q\u001a\u00020@2\u0006\u0010.\u001a\u00020@8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bN\u0010J\u001a\u0004\bO\u0010E\"\u0004\bP\u0010GR+\u0010U\u001a\u00020@2\u0006\u0010.\u001a\u00020@8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010J\u001a\u0004\bS\u0010E\"\u0004\bT\u0010GR+\u0010Y\u001a\u00020@2\u0006\u0010.\u001a\u00020@8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bV\u0010J\u001a\u0004\bW\u0010E\"\u0004\bX\u0010GR+\u0010]\u001a\u00020@2\u0006\u0010.\u001a\u00020@8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u0010J\u001a\u0004\b[\u0010E\"\u0004\b\\\u0010GR1\u0010c\u001a\u00020^2\u0006\u0010.\u001a\u00020^8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010E\"\u0004\bb\u0010GR1\u0010g\u001a\u00020^2\u0006\u0010.\u001a\u00020^8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bd\u0010`\u001a\u0004\be\u0010E\"\u0004\bf\u0010GR1\u0010k\u001a\u00020^2\u0006\u0010.\u001a\u00020^8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bh\u0010`\u001a\u0004\bi\u0010E\"\u0004\bj\u0010GR+\u0010o\u001a\u00020@2\u0006\u0010.\u001a\u00020@8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bl\u0010J\u001a\u0004\bm\u0010E\"\u0004\bn\u0010GR+\u0010s\u001a\u00020@2\u0006\u0010.\u001a\u00020@8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bp\u0010J\u001a\u0004\bq\u0010E\"\u0004\br\u0010GR+\u0010w\u001a\u00020@2\u0006\u0010.\u001a\u00020@8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bt\u0010J\u001a\u0004\bu\u0010E\"\u0004\bv\u0010GR+\u0010{\u001a\u00020@2\u0006\u0010.\u001a\u00020@8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bx\u0010J\u001a\u0004\by\u0010E\"\u0004\bz\u0010GR*\u0010\u007f\u001a\u00020@2\u0006\u0010A\u001a\u00020@8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b|\u0010C\u001a\u0004\b}\u0010E\"\u0004\b~\u0010GR.\u0010\u0083\u0001\u001a\u00020@2\u0006\u0010A\u001a\u00020@8\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010C\u001a\u0005\b\u0081\u0001\u0010E\"\u0005\b\u0082\u0001\u0010G\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0087\u0001"}, d2 = {"Landroidx/constraintlayout/compose/ConstrainScope;", "", "id", "Landroidx/constraintlayout/core/parser/CLObject;", "containerObject", "<init>", "(Ljava/lang/Object;Landroidx/constraintlayout/core/parser/CLObject;)V", c.f62177j, "Ljava/lang/Object;", "getId$constraintlayout_compose_release", "()Ljava/lang/Object;", "rl", "Landroidx/constraintlayout/core/parser/CLObject;", "()Landroidx/constraintlayout/core/parser/CLObject;", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "t", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "nr", "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "parent", "Landroidx/constraintlayout/compose/VerticalAnchorable;", "Landroidx/constraintlayout/compose/VerticalAnchorable;", "O", "()Landroidx/constraintlayout/compose/VerticalAnchorable;", TtmlNode.START, "getAbsoluteLeft", "absoluteLeft", "Landroidx/constraintlayout/compose/HorizontalAnchorable;", "J2", "Landroidx/constraintlayout/compose/HorizontalAnchorable;", "()Landroidx/constraintlayout/compose/HorizontalAnchorable;", "top", "Uo", TtmlNode.END, "KN", "getAbsoluteRight", "absoluteRight", "xMQ", "bottom", "Landroidx/constraintlayout/compose/BaselineAnchorable;", "mUb", "Landroidx/constraintlayout/compose/BaselineAnchorable;", "getBaseline", "()Landroidx/constraintlayout/compose/BaselineAnchorable;", "baseline", "Landroidx/constraintlayout/compose/Dimension;", "<set-?>", "gh", "Landroidx/constraintlayout/compose/ConstrainScope$DimensionProperty;", "getWidth", "()Landroidx/constraintlayout/compose/Dimension;", "(Landroidx/constraintlayout/compose/Dimension;)V", "width", "qie", "getHeight", "height", "Landroidx/constraintlayout/compose/Visibility;", "az", "Landroidx/constraintlayout/compose/ConstrainScope$visibility$2;", "getVisibility", "()Landroidx/constraintlayout/compose/Visibility;", "setVisibility", "(Landroidx/constraintlayout/compose/Visibility;)V", "visibility", "", "value", "ty", "F", "getAlpha", "()F", "setAlpha", "(F)V", "alpha", "HI", "Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;", "getScaleX", "setScaleX", "scaleX", "ck", "getScaleY", "setScaleY", "scaleY", "Ik", "getRotationX", "setRotationX", "rotationX", "r", "getRotationY", "setRotationY", "rotationY", "o", "getRotationZ", "setRotationZ", "rotationZ", "Landroidx/compose/ui/unit/Dp;", "Z", "Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;", "getTranslationX-D9Ej5fM", "setTranslationX-0680j_4", "translationX", "XQ", "getTranslationY-D9Ej5fM", "setTranslationY-0680j_4", "translationY", "S", "getTranslationZ-D9Ej5fM", "setTranslationZ-0680j_4", "translationZ", "WPU", "getPivotX", "setPivotX", "pivotX", "aYN", "getPivotY", "setPivotY", "pivotY", "ViF", "getHorizontalChainWeight", "setHorizontalChainWeight", "horizontalChainWeight", "nY", "getVerticalChainWeight", "setVerticalChainWeight", "verticalChainWeight", "g", "getHorizontalBias", "setHorizontalBias", "horizontalBias", "te", "getVerticalBias", "setVerticalBias", "verticalBias", "DimensionProperty", "DpProperty", "FloatProperty", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nConstrainScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstrainScope.kt\nandroidx/constraintlayout/compose/ConstrainScope\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,482:1\n149#2:483\n149#2:484\n149#2:485\n149#2:486\n149#2:487\n149#2:488\n149#2:489\n149#2:490\n149#2:491\n149#2:492\n149#2:493\n149#2:494\n149#2:495\n149#2:496\n149#2:497\n149#2:498\n149#2:499\n149#2:500\n149#2:501\n*S KotlinDebug\n*F\n+ 1 ConstrainScope.kt\nandroidx/constraintlayout/compose/ConstrainScope\n*L\n119#1:483\n122#1:484\n125#1:485\n193#1:486\n194#1:487\n195#1:488\n196#1:489\n214#1:490\n215#1:491\n216#1:492\n217#1:493\n238#1:494\n239#1:495\n240#1:496\n241#1:497\n242#1:498\n243#1:499\n244#1:500\n245#1:501\n*E\n"})
public final class ConstrainScope {
    static final /* synthetic */ KProperty[] iF = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "visibility", "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "scaleX", "getScaleX()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "scaleY", "getScaleY()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "rotationX", "getRotationX()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "rotationY", "getRotationY()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "rotationZ", "getRotationZ()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "translationX", "getTranslationX-D9Ej5fM()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "translationY", "getTranslationY-D9Ej5fM()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "pivotX", "getPivotX()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "pivotY", "getPivotY()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "horizontalChainWeight", "getHorizontalChainWeight()F", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(ConstrainScope.class, "verticalChainWeight", "getVerticalChainWeight()F", 0))};

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private final FloatProperty scaleX;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    private final FloatProperty rotationX;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final HorizontalAnchorable top;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final VerticalAnchorable absoluteRight;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final VerticalAnchorable absoluteLeft;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final DpProperty translationZ;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final VerticalAnchorable end;

    /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
    private final FloatProperty horizontalChainWeight;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private final FloatProperty pivotX;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private final DpProperty translationY;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final DpProperty translationX;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private final FloatProperty pivotY;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final ConstrainScope$visibility$2 visibility;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    private final FloatProperty scaleY;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float horizontalBias;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final DimensionProperty width;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final BaselineAnchorable baseline;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Object id;

    /* JADX INFO: renamed from: nY, reason: from kotlin metadata */
    private final FloatProperty verticalChainWeight;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final VerticalAnchorable start;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final FloatProperty rotationZ;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final DimensionProperty height;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final FloatProperty rotationY;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final CLObject containerObject;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ConstrainedLayoutReference parent = new ConstrainedLayoutReference("parent");

    /* JADX INFO: renamed from: te, reason: from kotlin metadata */
    private float verticalBias;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final HorizontalAnchorable bottom;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/constraintlayout/compose/ConstrainScope$DimensionProperty;", "Lkotlin/properties/ObservableProperty;", "Landroidx/constraintlayout/compose/Dimension;", "initialValue", "<init>", "(Landroidx/constraintlayout/compose/ConstrainScope;Landroidx/constraintlayout/compose/Dimension;)V", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", c.f62177j, "(Lkotlin/reflect/KProperty;Landroidx/constraintlayout/compose/Dimension;Landroidx/constraintlayout/compose/Dimension;)V", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class DimensionProperty extends ObservableProperty<Dimension> {
        public DimensionProperty(Dimension dimension) {
            super(dimension);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlin.properties.ObservableProperty
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void afterChange(KProperty property, Dimension oldValue, Dimension newValue) {
            CLObject containerObject = ConstrainScope.this.getContainerObject();
            String name = property.getName();
            Intrinsics.checkNotNull(newValue, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
            containerObject.wTp(name, ((DimensionDescription) newValue).n());
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0014ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;", "Lkotlin/properties/ObservableProperty;", "Landroidx/compose/ui/unit/Dp;", "initialValue", "", "nameOverride", "<init>", "(Landroidx/constraintlayout/compose/ConstrainScope;FLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", c.f62177j, "(Lkotlin/reflect/KProperty;FF)V", "Ljava/lang/String;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class DpProperty extends ObservableProperty<Dp> {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final String nameOverride;

        public /* synthetic */ DpProperty(ConstrainScope constrainScope, float f3, String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(f3, str);
        }

        private DpProperty(float f3, String str) {
            super(Dp.nr(f3));
            this.nameOverride = str;
        }

        @Override // kotlin.properties.ObservableProperty
        public /* bridge */ /* synthetic */ void afterChange(KProperty kProperty, Dp dp, Dp dp2) {
            n(kProperty, dp.getValue(), dp2.getValue());
        }

        protected void n(KProperty property, float oldValue, float newValue) {
            if (!Float.isNaN(newValue)) {
                CLObject containerObject = ConstrainScope.this.getContainerObject();
                String name = this.nameOverride;
                if (name == null) {
                    name = property.getName();
                }
                containerObject.v(name, newValue);
            }
        }

        public /* synthetic */ DpProperty(ConstrainScope constrainScope, float f3, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(constrainScope, f3, (i2 & 2) != 0 ? null : str, null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;", "Lkotlin/properties/ObservableProperty;", "", "initialValue", "", "nameOverride", "<init>", "(Landroidx/constraintlayout/compose/ConstrainScope;FLjava/lang/String;)V", "Lkotlin/reflect/KProperty;", "property", "oldValue", "newValue", "", c.f62177j, "(Lkotlin/reflect/KProperty;FF)V", "Ljava/lang/String;", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class FloatProperty extends ObservableProperty<Float> {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final String nameOverride;

        public FloatProperty(float f3, String str) {
            super(Float.valueOf(f3));
            this.nameOverride = str;
        }

        @Override // kotlin.properties.ObservableProperty
        public /* bridge */ /* synthetic */ void afterChange(KProperty kProperty, Float f3, Float f4) {
            n(kProperty, f3.floatValue(), f4.floatValue());
        }

        protected void n(KProperty property, float oldValue, float newValue) {
            if (!Float.isNaN(newValue)) {
                CLObject containerObject = ConstrainScope.this.getContainerObject();
                String name = this.nameOverride;
                if (name == null) {
                    name = property.getName();
                }
                containerObject.v(name, newValue);
            }
        }

        public /* synthetic */ FloatProperty(ConstrainScope constrainScope, float f3, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(f3, (i2 & 2) != 0 ? null : str);
        }
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final HorizontalAnchorable getTop() {
        return this.top;
    }

    public final void KN(Dimension dimension) {
        this.width.setValue(this, iF[0], dimension);
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final VerticalAnchorable getStart() {
        return this.start;
    }

    public final void Uo(Dimension dimension) {
        this.height.setValue(this, iF[1], dimension);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final HorizontalAnchorable getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final ConstrainedLayoutReference getParent() {
        return this.parent;
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final CLObject getContainerObject() {
        return this.containerObject;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final VerticalAnchorable getEnd() {
        return this.end;
    }

    /* JADX WARN: Type inference failed for: r15v3, types: [androidx.constraintlayout.compose.ConstrainScope$visibility$2] */
    public ConstrainScope(Object obj, CLObject cLObject) {
        this.id = obj;
        this.containerObject = cLObject;
        this.start = new ConstraintVerticalAnchorable(-2, cLObject);
        this.absoluteLeft = new ConstraintVerticalAnchorable(0, cLObject);
        this.top = new ConstraintHorizontalAnchorable(0, cLObject);
        this.end = new ConstraintVerticalAnchorable(-1, cLObject);
        this.absoluteRight = new ConstraintVerticalAnchorable(1, cLObject);
        this.bottom = new ConstraintHorizontalAnchorable(1, cLObject);
        this.baseline = new ConstraintBaselineAnchorable(cLObject);
        Dimension.Companion companion = Dimension.INSTANCE;
        this.width = new DimensionProperty(companion.t());
        this.height = new DimensionProperty(companion.t());
        final Visibility visibilityN = Visibility.INSTANCE.n();
        this.visibility = new ObservableProperty<Visibility>(visibilityN) { // from class: androidx.constraintlayout.compose.ConstrainScope$visibility$2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // kotlin.properties.ObservableProperty
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public void afterChange(KProperty property, Visibility oldValue, Visibility newValue) {
                this.f34440n.getContainerObject().rV9(property.getName(), newValue.getName());
            }
        };
        this.alpha = 1.0f;
        this.scaleX = new FloatProperty(this, 1.0f, null, 2, null);
        int i2 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        this.scaleY = new FloatProperty(this, 1.0f, str, i2, defaultConstructorMarker);
        float f3 = 0.0f;
        this.rotationX = new FloatProperty(this, f3, str, i2, defaultConstructorMarker);
        this.rotationY = new FloatProperty(this, f3, str, i2, defaultConstructorMarker);
        this.rotationZ = new FloatProperty(this, f3, str, i2, defaultConstructorMarker);
        float f4 = 0;
        this.translationX = new DpProperty(this, Dp.KN(f4), str, i2, defaultConstructorMarker);
        this.translationY = new DpProperty(this, Dp.KN(f4), str, i2, defaultConstructorMarker);
        this.translationZ = new DpProperty(this, Dp.KN(f4), str, i2, defaultConstructorMarker);
        float f5 = 0.5f;
        this.pivotX = new FloatProperty(this, f5, str, i2, defaultConstructorMarker);
        this.pivotY = new FloatProperty(this, f5, str, i2, defaultConstructorMarker);
        this.horizontalChainWeight = new FloatProperty(Float.NaN, "hWeight");
        this.verticalChainWeight = new FloatProperty(Float.NaN, "vWeight");
        this.horizontalBias = 0.5f;
        this.verticalBias = 0.5f;
    }
}
