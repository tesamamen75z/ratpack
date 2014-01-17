/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ratpack.http;

import io.netty.buffer.ByteBuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface RequestBody {

  /**
   * A structured representation of the "Content-Type" header value of the request.
   *
   * @return A structured representation of the "Content-Type" header value of the request.
   */
  MediaType getContentType();

  String getText();

  byte[] getBytes();

  ByteBuf getBuffer();

  void writeTo(OutputStream outputStream) throws IOException;

  InputStream getInputStream();
}

