# AffTracker- Affiliate Marketing Tracker
_____
- [AffTracker- Affiliate Marketing Tracker](#afftracker--affiliate-marketing-tracker)
  * [List of Microservices](#list-of-microservices)
    + <details><summary>[Tracker Service](#tracker-service)</summary>
      - [I. Traffic Source](#i-traffic-source)
        * [1) POST `/tracker/v1/traffic-source/create`](#1--post---tracker-v1-traffic-source-create-)
          + [Request Payload](#request-payload)
          + [Response Payload](#response-payload)
        * [2) PUT `/tracker/v1/traffic-source/update/<traffic-source-id>`](#2--put---tracker-v1-traffic-source-update--traffic-source-id--)
          + [Request Payload](#request-payload-1)
          + [Response Payload](#response-payload-1)
        * [3) GET `/tracker/v1/traffic-source/view/<traffic-source-id>`](#3--get---tracker-v1-traffic-source-view--traffic-source-id--)
          + [Response Payload](#response-payload-2)
        * [4) GET `/tracker/v1/traffic-source/viewall`](#4--get---tracker-v1-traffic-source-viewall-)
          + [Response Payload](#response-payload-3)
      - [II. Affiliate Network](#ii-affiliate-network)
        * [1) `/tracker/v1/affiliate-network/create`](#1----tracker-v1-affiliate-network-create-)
          + [Reqeust Payload](#reqeust-payload)
          + [Response Payload](#response-payload-4)
        * [2) `/tracker/v1/affiliate-network/update/<affiliate-network-id>`](#2----tracker-v1-affiliate-network-update--affiliate-network-id--)
          + [Reqeust Payload](#reqeust-payload-1)
          + [Response Payload](#response-payload-5)
        * [3) GET `/tracker/v1/affiliate-network/view/<affiliate-network-id>`](#3--get---tracker-v1-affiliate-network-view--affiliate-network-id--)
          + [Response Payload](#response-payload-6)
        * [3) GET `/tracker/v1/affiliate-network/viewall`](#3--get---tracker-v1-affiliate-network-viewall-)
          + [Response Payload](#response-payload-7)
      - [III. Offers](#iii-offers)
        * [1) `/tracker/v1/offer/create`](#1----tracker-v1-offer-create-)
          + [Request Payload](#request-payload-2)
          + [Response Payload](#response-payload-8)
        * [2) `/tracker/v1/offer/update/<offer-id>`](#2----tracker-v1-offer-update--offer-id--)
          + [Request Payload](#request-payload-3)
          + [Response Payload](#response-payload-9)
        * [3) GET `/tracker/v1/offer/view/<offer-id>`](#3--get---tracker-v1-offer-view--offer-id--)
          + [Response Payload](#response-payload-10)
        * [3) GET `/tracker/v1/offer/viewall`](#3--get---tracker-v1-offer-viewall-)
          + [Response Payload](#response-payload-11)
      - [IV. Campaigns](#iv-campaigns)
        * [1) `/tracker/v1/campaign/create`](#1----tracker-v1-campaign-create-)
          + [Request Payload](#request-payload-4)
          + [Response Payload](#response-payload-12)
        * [2) `/tracker/v1/campaign/update/<campaign_id>`](#2----tracker-v1-campaign-update--campaign-id--)
          + [Request Payload](#request-payload-5)
          + [Response Payload](#response-payload-13)
        * [3) GET `/tracker/v1/campaign/view/<campaign-id>`](#3--get---tracker-v1-campaign-view--campaign-id--)
          + [Response Payload](#response-payload-14)
        * [4) GET `/tracker/v1/campaign/viewall`](#4--get---tracker-v1-campaign-viewall-)
          + [Response Payload](#response-payload-15)
    </details>
    + [Landing Page Service](#landing-page-service)
      - [1) POST `/lander/v1/create`](#1--post---lander-v1-create-)
        * [Request Payload](#request-payload-6)
        * [Response Payload](#response-payload-16)
      - [2) PUT `/lander/v1/update/<landing-page-id>`](#2--put---lander-v1-update--landing-page-id--)
        * [Request Payload](#request-payload-7)
        * [Response Payload](#response-payload-17)
    + [Forwarder Service](#forwarder-service)
      - [Traffic Source to Affiliate Link](#traffic-source-to-affiliate-link)
      - [Receive conversion call](#receive-conversion-call)
    + [Reporting Service](#reporting-service)
      - [Offer Level Reports](#offer-level-reports)
        * [GET `/reporting/v1/report/viewall`](#get---reporting-v1-report-viewall-)
        * [GET `/reporting/v1/report/view/offer/<offer-id>`](#get---reporting-v1-report-view-offer--offer-id--)
        * [GET `/reporting/v1/report/view/offer/<offer-id>/campaign/<campaign-id>`](#get---reporting-v1-report-view-offer--offer-id--campaign--campaign-id--)
        * [GET `/reporting/v1/report/view/offer/<offer-id>/campaign/<campaign-id>/traffic_source/<traffic-source-id>`](#get---reporting-v1-report-view-offer--offer-id--campaign--campaign-id--traffic-source--traffic-source-id--)




## List of Microservices
- Tracker Service
- Reporting Service
- Landing Page Service
- Routing Service

### Tracker Service

#### I. Traffic Source

##### 1) POST `/tracker/v1/traffic-source/create`
###### Request Payload
```
{
	name: <traffic-source-name>,
	conversion_pixel: <conversion pixel code>,
	conversion_pixel_type: <Javascript|GET>,
	tracking_params: [<traffic_param_name, field_mapping_in_affTracker_term>]
}
```
###### Response Payload
```
{
	status: <status-code>,
	status_message: <status-message>
}
```
##### 2) PUT `/tracker/v1/traffic-source/update/<traffic-source-id>`
###### Request Payload
```
{
	name: <traffic-source-name>,
	conversion_pixel: <conversion pixel code>,
	conversion_pixel_type: <Javascript|GET>,
	tracking_params: [<param_name, field_value>]
}
```
###### Response Payload
```
{
	status: <status-code>,
	status_message: <status-message>
}
```
##### 3) GET `/tracker/v1/traffic-source/view/<traffic-source-id>`
###### Response Payload
```
{
	id: <traffic-source-id>,
	name: <traffic-source-name>,
	conversion_pixel: <conversion pixel code>,
	conversion_pixel_type: <Javascript|GET>,
	tracking_params: [<param_name, field_value>]
}
```

##### 4) GET `/tracker/v1/traffic-source/viewall`
###### Response Payload
```
[{
	id: <traffic-source-id>,
	name: <traffic-source-name>,
	conversion_pixel: <conversion pixel code>,
	conversion_pixel_type: <Javascript|GET>,
	tracking_params: [<param_name, field_value>]
}]
```

#### II. Affiliate Network

##### 1) `/tracker/v1/affiliate-network/create`
###### Reqeust Payload

```
{
	name: <affiliate-network-name>,
	tracking_params: <aff_nw_param_name, afftracker_field_name>
}
```
###### Response Payload
```
{
	status: <status-code>,
	status_message: <status-message>
}
```
##### 2) `/tracker/v1/affiliate-network/update/<affiliate-network-id>`
###### Reqeust Payload

```
{
	name: <affiliate-network-name>,
	tracking_params: [<aff_nw_param_name, afftracker_field_name>]
}
```
###### Response Payload
```
{
	status: <status-code>,
	status_message: <status-message>
}
```
##### 3) GET `/tracker/v1/affiliate-network/view/<affiliate-network-id>`
###### Response Payload
```
{
	id: <affiliate-network-id>,
	name: <affiliate-network-name>,
	tracking_params: [<param_name, field_value>]
}
```
##### 3) GET `/tracker/v1/affiliate-network/viewall`
###### Response Payload
```
[{
	id: <affiliate-network-id>,
	name: <affiliate-network-name>,
	tracking_params: [<param_name, field_value>]
}]
```


#### III. Offers
##### 1) `/tracker/v1/offer/create`
###### Request Payload
```
{
	name: <offer-name>,
	url: <offer url without any tracking params of affiliate network>,
	selected_params: [<param_name>],
	countries: [<country_name>]
}
```
###### Response Payload
```
{
	status: <status-code>,
	status_message: <status-message>
}
```
##### 2) `/tracker/v1/offer/update/<offer-id>`
###### Request Payload
```
{
	name: <offer-name>,
	url: <offer url without any tracking params of affiliate network>,
	selected_params: [<param_name>],
	countries: [<country_name>]
}
```
###### Response Payload
```
{
	status: <status-code>,
	status_message: <status-message>
}
```
##### 3) GET `/tracker/v1/offer/view/<offer-id>`
###### Response Payload
```
{
	id: <offer-id>,
	name: <offer-name>,
	selected_params: [<param_name>],
	countries: [<country_name>]
}
```
##### 3) GET `/tracker/v1/offer/viewall`
###### Response Payload
```
[{
	id: <offer-id>,
	name: <offer-name>,
	selected_params: [<param_name>],
	countries: [<country_name>]
}]
```

#### IV. Campaigns
##### 1) `/tracker/v1/campaign/create`
###### Request Payload
```
{
	campaign_name: <campaign_name>,
	offer: <offer_id, offer_name>,
	traffic_source: <traffic_source_id, traffic_source_name>,
	landing_page: <landing_page_id, landing_page_url>
}
```
###### Response Payload
```
{
	status: <status-code>,
	status_message: <status-message>,
	urls: [<url_name, url>]
}
```

##### 2) `/tracker/v1/campaign/update/<campaign_id>`
###### Request Payload
```
{
	campaign_name: <campaign_name>,
	offer: <offer_id, offer_name>,
	traffic_source: <traffic_source_id, traffic_source_name>,
	landing_page: <landing_page_id, landing_page_url>,
}
```
###### Response Payload
```
{
	status: <status-code>,
	status_message: <status-message>,
	urls: [<url_name, url>]
}
```
##### 3) GET `/tracker/v1/campaign/view/<campaign-id>`
###### Response Payload
```
{
	id: <campaign-id>,
	campaign_name: <campaign-name>,
	offer: <offer_id, offer_name>,
	traffic_source: <traffic_source_id, traffic_source_name>,
	landing_page: <landing_page_id, landingpage_url>,
	urls: [<url_name, url>]
}
```
##### 4) GET `/tracker/v1/campaign/viewall`
###### Response Payload
```
[{
	id: <campaign-id>,
	campaign_name: <campaign-name>,
	offer: <offer_id, offer_name>,
	traffic_source: <traffic_source_id, traffic_source_name>,
	landing_page: <landing_page_id, landingpage_url>,
	urls: [<url_name, url>]
}]
```

### Landing Page Service

#### 1) POST `/lander/v1/create`
##### Request Payload
```
{
	landing_page_name: <landing-page-name>,
	landing_page_archive_path: <zip-archive-path>,
	landing_page_title: <landing-page-title>,
	landing_page_url: <specific-url-text after base url; random number to be appended if already exists>,
	tracking_addons: [<tracking-addon-id, tracking-addon-name>]
}
```
> Tracking addons - as in on click of link, track which link the user clicked, how much time did user spent on the page, cookie tracking of the page i.e. when the last time user loaded the page
> Service extracts the page and put it in public folder and creates a mapping for the landing page url

##### Response Payload
```
{
	status_code: <status-code>,
	status_message: <status-message>
}
```

#### 2) PUT `/lander/v1/update/<landing-page-id>`
##### Request Payload
```
{
	landing_page_name: <landing-page-name>,
	landing_page_archive_path: <zip-archive-path>,
	landing_page_title: <landing-page-title>,
	landing_page_url: <specific-url-text after base url>,
	tracking_addons: [<tracking-addon-id, tracking-addon-name>]
}
```
##### Response Payload
```
{
	status_code: <status-code>,
	status_message: <status-message>
}
```


### Forwarder Service
#### Traffic Source to Affiliate Link
- Forwarder service will receive traffic from traffic source
- Grab all the tracking params from url and put against campaign id
- Route to offer generated url based upon selected parameters

#### Receive conversion call
- Forwarder service will receive traffic from affiliate network
- Grab the tracking param and based upon click-id update the campaign data for conversion
- Call pixel of traffic source i.e. link or execute javascript code

### Reporting Service
#### Offer Level Reports
##### GET `/reporting/v1/report/viewall`
- Gives list of all offers, conversion statistics

##### GET `/reporting/v1/report/view/offer/<offer-id>`
- Gives list of all campaigns running with conversion statistics

##### GET `/reporting/v1/report/view/offer/<offer-id>/campaign/<campaign-id>`
- Gives list of all traffic sources sending traffic to the campaign and conversion statistics

##### GET `/reporting/v1/report/view/offer/<offer-id>/campaign/<campaign-id>/traffic_source/<traffic-source-id>`
- Gives list of all tracking params and their value and addon tracking details i.e. clicked where, time spent etc






