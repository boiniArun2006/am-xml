package androidx.compose.ui.text;

import android.text.Editable;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\rJ0\u0010\u0019\u001a\u00020\t2\u000e\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\rJ \u0010\u001d\u001a\u00020\t2\u000e\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ0\u0010\u001f\u001a\u00020\t2\u000e\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ0\u0010 \u001a\u00020\t2\u000e\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\u001c0\u001c2\u000e\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b \u0010!J \u0010#\u001a\u00020\t2\u000e\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\"0\"H\u0096\u0001¢\u0006\u0004\b#\u0010$J \u0010%\u001a\u00020\t2\u000e\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b%\u0010\u001eJ\u0010\u0010&\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b&\u0010\rJ0\u0010'\u001a\u00020\t2\u000e\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\u001c0\u001c2\u000e\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b'\u0010!J7\u0010,\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u001c2\b\u0010)\u001a\u0004\u0018\u00010\u001c2\b\u0010*\u001a\u0004\u0018\u00010\u001c2\b\u0010+\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b,\u0010-J-\u0010.\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u001c2\b\u0010)\u001a\u0004\u0018\u00010\u001c2\b\u0010*\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00100R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00101R\u0016\u00103\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00102R\u0018\u00106\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00105¨\u00067"}, d2 = {"Landroidx/compose/ui/text/AnnotationContentHandler;", "Lorg/xml/sax/ContentHandler;", "contentHandler", "Landroid/text/Editable;", "output", "<init>", "(Lorg/xml/sax/ContentHandler;Landroid/text/Editable;)V", "Lorg/xml/sax/Attributes;", "attributes", "", "t", "(Lorg/xml/sax/Attributes;)V", "rl", "()V", "Uo", "J2", "O", "nr", c.f62177j, "", "kotlin.jvm.PlatformType", "p0", "", "p1", "p2", "characters", "([CII)V", "endDocument", "", "endPrefixMapping", "(Ljava/lang/String;)V", "ignorableWhitespace", "processingInstruction", "(Ljava/lang/String;Ljava/lang/String;)V", "Lorg/xml/sax/Locator;", "setDocumentLocator", "(Lorg/xml/sax/Locator;)V", "skippedEntity", "startDocument", "startPrefixMapping", "uri", "localName", "qName", "atts", "startElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V", "endElement", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lorg/xml/sax/ContentHandler;", "Landroid/text/Editable;", "I", "bulletIndentation", "Landroidx/compose/ui/text/BulletSpanWithLevel;", "Landroidx/compose/ui/text/BulletSpanWithLevel;", "currentBulletSpan", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHtml.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Html.android.kt\nandroidx/compose/ui/text/AnnotationContentHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,378:1\n1#2:379\n3792#3:380\n4307#3,2:381\n34#4,6:383\n*S KotlinDebug\n*F\n+ 1 Html.android.kt\nandroidx/compose/ui/text/AnnotationContentHandler\n*L\n308#1:380\n308#1:381,2\n309#1:383,6\n*E\n"})
final class AnnotationContentHandler implements ContentHandler {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ContentHandler contentHandler;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private BulletSpanWithLevel currentBulletSpan;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Editable output;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int bulletIndentation;

    @Override // org.xml.sax.ContentHandler
    public void characters(char[] p0, int p1, int p2) throws SAXException {
        this.contentHandler.characters(p0, p1, p2);
    }

    @Override // org.xml.sax.ContentHandler
    public void endDocument() throws SAXException {
        this.contentHandler.endDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public void endPrefixMapping(String p0) throws SAXException {
        this.contentHandler.endPrefixMapping(p0);
    }

    @Override // org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] p0, int p1, int p2) throws SAXException {
        this.contentHandler.ignorableWhitespace(p0, p1, p2);
    }

    @Override // org.xml.sax.ContentHandler
    public void processingInstruction(String p0, String p1) throws SAXException {
        this.contentHandler.processingInstruction(p0, p1);
    }

    @Override // org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator p0) {
        this.contentHandler.setDocumentLocator(p0);
    }

    @Override // org.xml.sax.ContentHandler
    public void skippedEntity(String p0) throws SAXException {
        this.contentHandler.skippedEntity(p0);
    }

    @Override // org.xml.sax.ContentHandler
    public void startDocument() throws SAXException {
        this.contentHandler.startDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public void startPrefixMapping(String p0, String p1) throws SAXException {
        this.contentHandler.startPrefixMapping(p0, p1);
    }

    private final void n() {
        BulletSpanWithLevel bulletSpanWithLevel = this.currentBulletSpan;
        if (bulletSpanWithLevel != null) {
            this.output.setSpan(bulletSpanWithLevel, bulletSpanWithLevel.getStart(), this.output.length(), 33);
        }
        this.currentBulletSpan = null;
    }

    private final void rl() {
        Editable editable = this.output;
        Object[] spans = editable.getSpans(0, editable.length(), AnnotationSpan.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : spans) {
            if (this.output.getSpanFlags((AnnotationSpan) obj) == 17) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotationSpan annotationSpan = (AnnotationSpan) arrayList.get(i2);
            int spanStart = this.output.getSpanStart(annotationSpan);
            int length = this.output.length();
            this.output.removeSpan(annotationSpan);
            if (spanStart != length) {
                this.output.setSpan(annotationSpan, spanStart, length, 33);
            }
        }
    }

    @Override // org.xml.sax.ContentHandler
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (localName != null) {
            int iHashCode = localName.hashCode();
            if (iHashCode != -1555043537) {
                if (iHashCode != 3453) {
                    if (iHashCode == 3735 && localName.equals("ul")) {
                        J2();
                        return;
                    }
                } else if (localName.equals("li")) {
                    nr();
                    return;
                }
            } else if (localName.equals("annotation")) {
                rl();
                return;
            }
        }
        this.contentHandler.endElement(uri, localName, qName);
    }

    @Override // org.xml.sax.ContentHandler
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        if (localName != null) {
            int iHashCode = localName.hashCode();
            if (iHashCode != -1555043537) {
                if (iHashCode != 3453) {
                    if (iHashCode == 3735 && localName.equals("ul")) {
                        Uo();
                        return;
                    }
                } else if (localName.equals("li")) {
                    O();
                    return;
                }
            } else if (localName.equals("annotation")) {
                if (atts != null) {
                    t(atts);
                    return;
                }
                return;
            }
        }
        this.contentHandler.startElement(uri, localName, qName, atts);
    }

    public AnnotationContentHandler(ContentHandler contentHandler, Editable editable) {
        this.contentHandler = contentHandler;
        this.output = editable;
    }

    private final void J2() {
        n();
        this.bulletIndentation--;
    }

    private final void O() {
        n();
        this.currentBulletSpan = new BulletSpanWithLevel(BulletKt.n(), this.bulletIndentation, this.output.length());
    }

    private final void Uo() {
        n();
        this.bulletIndentation++;
    }

    private final void nr() {
        n();
    }

    private final void t(Attributes attributes) {
        int length = attributes.getLength();
        for (int i2 = 0; i2 < length; i2++) {
            String localName = attributes.getLocalName(i2);
            String str = "";
            if (localName == null) {
                localName = "";
            }
            String value = attributes.getValue(i2);
            if (value != null) {
                str = value;
            }
            if (localName.length() > 0 && str.length() > 0) {
                int length2 = this.output.length();
                this.output.setSpan(new AnnotationSpan(localName, str), length2, length2, 17);
            }
        }
    }
}
