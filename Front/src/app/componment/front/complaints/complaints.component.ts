import { Component } from '@angular/core';

@Component({
  selector: 'app-complaints',
  templateUrl: './complaints.component.html',
  styleUrls: ['./complaints.component.css']
})
export class ComplaintsComponent {
 activeTab = 0;

  apartments = [
    {
      title: 'Modern Loft',
      image: '/assets/images/Fig.png',
      description: 'A modern apartment in the city center with 2 bedrooms and a balcony.'
    },
    {
      title: 'Cozy Studio',
      image: '/assets/images/Fig.png',
      description: 'Perfect for singles or couples, this cozy studio offers comfort and convenience.'
    },
    {
      title: 'Family Apartment',
      image: '/assets/images/Fig.png',
      description: 'Spacious 3-bedroom apartment ideal for families, close to schools and parks.'
    },
     {
      title: 'Family Apartment',
      image: '/assets/images/Fig.png',
      description: 'Spacious 3-bedroom apartment ideal for families, close to schools and parks.'
    },
     {
      title: 'Family Apartment',
      image: '/assets/images/Fig.png',
      description: 'Spacious 3-bedroom apartment ideal for families, close to schools and parks.'
    },
     {
      title: 'Family Apartment',
      image: '/assets/images/Fig.png',
      description: 'Spacious 3-bedroom apartment ideal for families, close to schools and parks.'
    },
     {
      title: 'Family Apartment',
      image: '/assets/images/Fig.png',
      description: 'Spacious 3-bedroom apartment ideal for families, close to schools and parks.'
    },
     {
      title: 'Family Apartment',
      image: '/assets/images/Fig.png',
      description: 'Spacious 3-bedroom apartment ideal for families, close to schools and parks.'
    },
     {
      title: 'Family Apartment',
      image: '/assets/images/Fig.png',
      description: 'Spacious 3-bedroom apartment ideal for families, close to schools and parks.'
    }
  ];

  selectTab(index: number) {
    this.activeTab = index;
  }

  bookApartment(name: string) {
    alert(`Booking request sent for: ${name}`);
  }
}
