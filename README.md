<img src="/art/van-gogh-logo-light.png" width="360px"/> 

[![Build Status](https://travis-ci.org/PSPDFKit-labs/VanGogh.svg?branch=master)](https://travis-ci.org/PSPDFKit-labs/VanGogh)

*Great things are done by a series of small things brought together. RxJava meets Animations.*

VanGogh is a lightweight library that takes Android view animation logic and binds it with RxJava2, providing a simple and powerful API for manipulating animations workflow.

It also provides various pre-made commonly used animations such as fading, rotating, moving, etc. with new ones constantly being added. Another thing that you get are the base animation wrappers so you can create your own complex animations with custom actions.

For documentation on how to use the library, [please check the VanGogh wiki page](https://github.com/PSPDFKit-labs/VanGogh/wiki).

To learn more, [see the announcement post on PSPDFKit's blog.](https://pspdfkit.com/blog/2017/reactive-animations-on-android-with-van-gogh/)

PSPDFKit offers [SDKs for iOS, Android, macOS, Windows and Web](https://pspdfkit.com/pdf-sdk/) to view, edit, annotate, fill forms and digitally sign PDF documents. VanGogh is used in [PDF Viewer for Android](https://pdfviewer.io/) as the main animation library.

## Download

Add maven central repo to your repositories in `build.gradle`:

```gradle
repositories {
  mavenCentral()
}
```

And latest version to your dependencies:

```gradle
compile 'com.pspdfkit-labs:vangogh:0.1.0'
```

Snapshots of the development version are available in [Sonatype's snapshots repository](https://oss.sonatype.org/content/repositories/snapshots/).

## License

```
MIT License

Copyright (c) 2017 PSPDFKit GmbH

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
