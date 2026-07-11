package com.applovin.impl;

import android.util.Xml;
import com.applovin.impl.sdk.C1802k;
import com.applovin.impl.sdk.C1804o;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class q8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C1804o f49804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Stack f49805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StringBuilder f49806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f49807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f49808e;

    class a implements ContentHandler {
        @Override // org.xml.sax.ContentHandler
        public void endPrefixMapping(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void ignorableWhitespace(char[] cArr, int i2, int i3) {
        }

        @Override // org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
        }

        @Override // org.xml.sax.ContentHandler
        public void setDocumentLocator(Locator locator) {
        }

        @Override // org.xml.sax.ContentHandler
        public void skippedEntity(String str) {
        }

        @Override // org.xml.sax.ContentHandler
        public void startPrefixMapping(String str, String str2) {
        }

        a() {
        }

        @Override // org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i2, int i3) {
            String strTrim = new String(Arrays.copyOfRange(cArr, i2, i3)).trim();
            if (StringUtils.isValidString(strTrim)) {
                q8.this.f49806c.append(strTrim);
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endDocument() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - q8.this.f49807d;
            C1804o unused = q8.this.f49804a;
            if (C1804o.a()) {
                q8.this.f49804a.a("XmlParser", "Finished parsing in " + seconds + " seconds");
            }
        }

        @Override // org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            q8 q8Var = q8.this;
            q8Var.f49808e = (b) q8Var.f49805b.pop();
            q8.this.f49808e.d(q8.this.f49806c.toString().trim());
            q8.this.f49806c.setLength(0);
        }

        @Override // org.xml.sax.ContentHandler
        public void startDocument() {
            C1804o unused = q8.this.f49804a;
            if (C1804o.a()) {
                q8.this.f49804a.a("XmlParser", "Begin parsing...");
            }
            q8.this.f49807d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }

        @Override // org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            try {
                b bVar = !q8.this.f49805b.isEmpty() ? (b) q8.this.f49805b.peek() : null;
                b bVar2 = new b(str2, q8.this.a(attributes), bVar);
                if (bVar != null) {
                    bVar.a(bVar2);
                }
                q8.this.f49805b.push(bVar2);
            } catch (Exception e2) {
                C1804o unused = q8.this.f49804a;
                if (C1804o.a()) {
                    q8.this.f49804a.a("XmlParser", "Unable to process element <" + str2 + ">", e2);
                }
                throw new SAXException("Failed to start element", e2);
            }
        }
    }

    private static class b extends p8 {
        void a(p8 p8Var) {
            if (p8Var == null) {
                throw new IllegalArgumentException("None specified.");
            }
            this.f49701e.add(p8Var);
        }

        void d(String str) {
            this.f49700d = str;
        }

        b(String str, Map map, p8 p8Var) {
            super(str, map, p8Var);
        }
    }

    q8(C1802k c1802k) {
        if (c1802k != null) {
            this.f49804a = c1802k.O();
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public static p8 a(String str, C1802k c1802k) {
        return new q8(c1802k).a(str);
    }

    public p8 a(String str) throws SAXException {
        if (str != null) {
            this.f49806c = new StringBuilder();
            this.f49805b = new Stack();
            this.f49808e = null;
            Xml.parse(str, new a());
            b bVar = this.f49808e;
            if (bVar != null) {
                return bVar;
            }
            throw new SAXException("Unable to parse XML into node");
        }
        throw new IllegalArgumentException("Unable to parse. No XML specified.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map a(Attributes attributes) {
        if (attributes != null) {
            int length = attributes.getLength();
            HashMap map = new HashMap(length);
            for (int i2 = 0; i2 < length; i2++) {
                map.put(attributes.getQName(i2), attributes.getValue(i2));
            }
            return map;
        }
        return Collections.EMPTY_MAP;
    }
}
