- [AffTracker- Affiliate Marketing Tracker](#afftracker--affiliate-marketing-tracker)
  * [List of Microservices](#list-of-microservices)
    + [Tracker Service](#tracker-service)
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

# AffTracker- Affiliate Marketing Tracker
_____

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
	landing_page: <landing_page_id, landing_page_url>,
	urls: [<url_name, url>]
}
```
###### Response Payload
```
{
	status: <status-code>,
	status_message: <status-message>
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
	status_message: <status-message>
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
	landing_page: <landing_page_id, landingpage_url>
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
	landing_page: <landing_page_id, landingpage_url>
}]
```



















