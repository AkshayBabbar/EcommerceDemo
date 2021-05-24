# Ecommerce

## Technology selection

### Backend technology

TECHNOLOGY | Name 
----|----
Spring Boot | Container + MVC framework
Spring Security | Authentication and authorization framework
MyBatis | ORM framework  
MyBatisGenerator | Data layer code generation  
PageHelper | My Batis physical paging plugin  
Swagger-UI | Document production tool
Hibernator-Validator | Validation framework
Elasticsearch | SEARCH ENGINE
RabbitMq | MESSAGE QUEUE
Redis | Distributed cache
MongoDb | No Sql database
Docker | Application container engine
Druid | Database connection pool

###Front-end technology

Technology | Name 
----|----
Vue | Front-end framework
Vue-router | Routing framework
Vuex | Global State Management Framework
Element | Front-end UI framework
Axios | Front-end HTTP framework
Js-cookie | COOKIE MANAGEMENT TOOL

### Frame construction

Function | complete 
----|----
集成MyBatis | ✔
集成MyBatisGenerator | ✔
集成SpringSecurity | ✔
集成Swagger-UI | ✔
集成Hibernator-Validator | ✔
Integrated log function | ✔
Integrated monitoring function | ✔
crud操作demo | ✔
Reasonably plan the package structure | ✔
SpringAOP通用日志处理 | ✔
SpringAOP通用验证失败结果返回 | ✔
CommonResult对通用返回结果进行封装 | ✔
SpringSecurity登录改为Restful形式 | ✔
JWT登录、注册、获取token | ✔
JTA事务处理 | ✔
Integrated unit test | ✔
OSS upload function | ✔
Elasticsearch搜索功能 | ✔
HTTPS支持 | ✔
Redis digital ID generation | ✔
Spring Task timing task support | ✔
Docker containerized deployment | ✔
Configure to distinguish between production and test environments | ✔
ELK日志收集功能 | ✔
RabbitMq异步通信 | ✔
RestTemplate服务间调用 | ✔
SpringSecurity权限管理功能 | ✔
集成SpringCloud |

### USE TOOLS

工具 | 下载地址 
----|----
Development tool idea | https://www.jetbrains.com/idea/download
REDIS CLIENT CONNECTION TOOL | https://redisdesktop.com/download
MONGO CLIENT CONNECTION TOOL | https://robomongo.org/download
Local host management | https://oldj.github.io/SwitchHosts/
Linux remote connection tool | http://www.netsarang.com/download/software.html
Database connection tool | http://www.formysql.com/xiazai.html
Database design tool | http://powerdesigner.de/
Prototyping tool | https://www.axure.com/
Mind map design tool | http://www.edrawsoft.cn/mindmaster
GIF RECORDING TOOL | https://www.screentogif.com/

### Background function

#### Background login function ✔

- Back-end user registration function
- Get the token after the background user logs in
- Refresh token function

#### Merchandise management ✔

> **Commodity classification management**

- View the category list by page by parent category number
- Add, edit, delete categories
- Transfer classified goods

> **Commodity brand management**

- Search by brand name to page to view the brand list
- Add, edit, delete brands
- View all products of the current brand

> **Commodity attribute classification management**

- Add product attribute classification (name)
- Pagination to query all product attribute categories
- Delete a single product attribute classification
- Modify the name of a single attribute category
- Query classification information of a single attribute

> **Commodity attribute management**

- Query attribute list or parameter list according to classification (pagination, support type)
- Add product attributes
- Query a single product attribute
- Edit product attributes
- Delete product attributes in bulk
- Pagination to query all product attributes

> **Adding goods**

- Select product category: Find the category based on 8 product category id
- Select brand: query all brands
- Choose shipping template: query all shipping templates
- Set member price: query all member levels, and import List<Pms Member Price>
- Add ladder price: parameter is passed to List<PmsProductLadder>
- Set full reduction price: parameter input List<PmsProductFullReduction>
- select product attribute category: get all product attribute categories, get specifications and parameters according to the id of the product attribute category (type=0->specifications; type=1->parameters)
- Select specifications and generate inventory information: Front-end implementation
- Add sku inventory information: parameter input List<PmsSkuStock>
- Set attribute picture: set it to pic and album_pics fields 
- Add product parameter: parameter input List<PmsProductAttributeValue>
- Add Custom product specifications: parameter input List<PmsProductAttributeValue>
- related topic: parameter input List<CmsSubjectProductRelation> relationship
- relationship preference: parameter input List<CmsPrefrenceAreaProductRelation> relationship

> **Modify the product**


- Query product information based on product id
- Query basic product information: product category name, brand name, shipping template name
- Query product promotion information: product member price, step price, full discount price
- Query product attribute information: product attribute category name, SKU inventory information, attribute classification corresponding specifications and parameter values
- Query product related information: product related topics and related preferences
- Modify product information: product attribute classification and specifications cannot be modified, only the modification, deletion, and addition of a single sku; product attributes Classification and specifications can be modified: after modification, the original sku inventory and attribute classification will be displayed at the same time
- Query product information based on product id
- Query basic product information: product category name, brand name, shipping template name
- Query product promotion information: product member price, step price, full discount
- Query product attribute information: product attribute category name, Sku inventory information, attribute classification corresponding specifications and parameter values
- Query product related information: product related topics and related preferences
- Modify product information: product attribute classification and specifications cannot be modified, only the modification, deletion, and addition of a single sku are supported; Attribute classification and specifications can be modified: after modification, the original sku inventory and attribute classification will be displayed at the same time

> **Product Pagination Query**


- The status of the product: all products, on the shelf, not on the shelf, pending review, failed (publishStatus verifyStatus)
- Product name (%name%)
- Product number (productSn)
- Product category id (productCategoryId)
- Product brand id (brandId)
- Batch operations: put on and off shelves, recommend, new products, transfer classification, put into the recycle bin, audit
- View records: audit records, operation logs
- sku: obtain sku information according to the product and sku number, and modify sku information in batches

> **Commodity recycling management**

- Display the list of recycled goods in pagination
- Restore function of recycled goods

#### Promotion management

> **Spike activity management**

-	Event list display
-	Event online and offline
-	Set event products
-	Add, edit, delete events

> **Coupon management**


- Coupon list display
- Add, edit, delete coupons
- View coupon collection records

> **Event management**


-	Event list display
-	Add, edit, delete events
-	Event online and offline
-	Post to ad

> **Home Recommendation**

-	Brand recommendation: list display, whether to recommend, sort, delete, multi
-	select to add to the brand
-	Fresh Goods: product list display, whether to recommend, sort, delete, multi
-	select to add products
-	Popular recommendation: product list display, whether to recommend, sort, Delete, multiple selection to add products
-	Feature selection: topic list display, whether to recommend, sort, delete, multiple selection to add to the topic
-	Advertising management: advertising list display, whether to go online, sort, delete, add edit ads

#### Content management

> **Topic management**

- Topic list: view, delete, recommend topics
- Add and edit topics: select topic categories, add, delete related products
- Thematic classification management: control display, sort, edit and delete classification

> **Preferred theme**

- Preferred list: control display, sort, delete
- Add and edit preferences: associate and delete products

> **Topic management**

- Topic list: view, delete, hot topics
- Topic category management: control display, sort, edit and delete categories

> **Help manage**

- Help list: view, delete, control display
- Add and edit help: select help category
- Help category management: control display, sort, edit and delete categories

#### User Management

> **User Management**

- User list: account activation, deletion, group texting
- Batch operation: group SMS, station letter, push, set label, gift coupon
- View and edit user information: user details (statistics, shipping address, order records), edit information, login log
- Purchasing power screening: recent consumption, consumption times, consumption amount, average order price, product classification, membership level, user label
- User tag management: tag list, add, edit, delete
- Membership level setting: list, add, edit, set the default membership level

> **Talent value and points**

- Growth value and points query: list display, points details, growth value details, modification values
- Task reward setting: novice task, daily task
- More rules settings: growth value rules, points rules, points consumption settings

#### Order management

> **Order List**

- Order search: order number, consignee name number, order status, order classification, order source, submission time
- Order operations: view orders, close orders, order delivery, order tracking, delete orders
- Batch operation: batch delivery, close order, delete order

> **CHECK ORDER**

- Order status: order submission, payment order, platform delivery, receipt confirmation, evaluation completed
- Order details operations: modify invoice information, modify consignee information, modify product information, modify fee information, send station letter, close order, remark order, cancel order, order tracking, delete order
- Basic order information: order information, discount information, user information
- Invoice information: type, header, content, bill recipient information
- Consignee information: consignee, mobile phone number, postal code, delivery address
- Commodity information: contains basic commodity information
- Cost information: total and discount information
- Operational information: order status change record

> **Order settings**

- Spike order timeout
- Normal order timeout
- Automatic order completion time
- Automatic end of transaction time
- Automatic praise time

> **Return request processing**

- Return application search: service order number, consignee name number, processing status, application time, operator, processing time
- Bulk operation: delete
- View details: return goods, service order information, confirm return, refuse return, confirm receipt

> **Return reason setting**

- Reason list: type, sort, whether to enable, add time
- Reason for adding and editing: Same as above
- Bulk operation: delete

#### AUTHORITY MANAGEMENT ✔

> **AUTHORITY MANAGEMENT**

- Authority management: add authority, delete authority, modify authority, return authority in tree structure
- Role management: add roles, delete roles, update roles, role lists, obtain corresponding role permissions, modify corresponding role permissions
- Member management: add, edit, delete members, list of members, assign roles to members, get member roles, assign +- permissions, get permission lists

role | MENU 
----|----
administrator | All menu permissions
Operation | Homepage, users, promotions, operations, content
financial affairs | Homepage, statistics, finance
Art | Home, Products
Customer service | Homepage, merchandise, order

### Front desk function

#### PRODUCT SEARCH ✔

> **Comprehensive search function**

- Search: Search based on product title, subtitle, and keywords;
- Filtering: Aggregate search results when no category is selected, select the category with the most occurrences, after selecting the category, you can filter according to the filter field of the selected category;
- Sort: sort by new product, sales volume, price
- Search results returned: product ID, product image, name, subtitle, price, product sales, new products, product parameters, brand name, category name
- Interface: query related data from the database and import es, insert (modify) data interface, delete data interface
- Brand classification filter: Aggregate search results to return brands, classifications and attributes

> **Product recommendation function**

- Recommend a product related to a product, according to the product's brand (10), category (6), name (8), keywords (2), subtitle (2)
- Recommend products based on user's browsing records in a week, and recommend products based on user search records

> **Product hot search function**

- Aggregate and generate hot search terms based on user search records

> **Product search association function** 

- Aggregate and generate hot search terms based on user search records

#### SHOPPING PROCESS ✔

> **SHOPPING CART** 

- Add product to shopping cart
- Shopping cart product list (product main image, product name, product quantity, product specifications)
- Modify the number of items in the shopping cart
- Reselect specifications of items in the shopping cart
- Item delete function in shopping cart

> **Generate confirmation** 

- Generate confirmation information: receiving information, product information, price information, invoice information, payment method
- Select delivery address: default delivery address
- Select coupons and points deduction: display available coupons and unavailable coupons
- Calculate product price: total product, shipping, coupon deduction, point deduction, activity discount
- Choose payment method: online payment and cash on delivery
- Calculate the amount payable: total + shipping-coupon deduction-point deduction-activity discount

> **Submit orders** 

- Convert confirmation information into orders
- Delete related items in the shopping cart
- Add order to database and lock inventory
- Online payment choose payment method: Alipay, WeChat, UnionPay, Apple Pay

> **Pay order**

- After the payment is completed, modify the order status to paid and deduct the inventory

> **Cancel order (if not paid)**

- After the order expires, the order will be automatically cancelled, the product inventory lock will be released, coupons and points will be returned

#### Membership module (my)✔

> **MY FOCUS**


- Follow brand list: brand logo, name, address, number of followers
- Unfollow function
- Watch list display

> **MY COLLECTION**


-	Collected goods: product main image, name, selling point, price, find similarity
-	Favorite topics: thematic main image, title, subtitle, number of favorites, number of views, comments
-	Favorite topic: topic main image, title, subtitle , Number of favorites, number of views, number of comments

> **My footprint**


- Browsed products: product main picture, name, selling point, price, find similarity
- delete record function
- browse list display

> **Member Login Register**



-	Login function: https login
-	Registration function: username, password, mobile phone number, mobile phone verification code
-	Get verification code: generate a verification code in the background, the verification code is bound to the mobile phone number
-	Forgot password: mobile phone number, SMS verification code, new password
-	Logout function
