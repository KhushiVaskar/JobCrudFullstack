## Prerequisites
Before you begin, ensure you have the following installed:

- **Node.js**: Version 22 or later
- **Angular CLI**: Install globally with `npm install -g @angular/cli@19`

## Setup Instructions

1. **Create a New Project**:

   ```bash
   ng new job-crud --style=css --routing=true --standalone=true
   cd job-crud
   ```

2. **Install Angular CDK**:

   ```bash
   npm install @angular/cdk
   ```

3. **Install Angular Material**:

   ```bash
   npm install @angular/material
   ```

   Alternatively, use the Angular CLI schematic to automate setup:

   ```bash
   ng add @angular/material
   ```
   
   # Install Bootstrap 5.3.5
npm install bootstrap@5.3.5



# Generate components
ng generate component components/job-list
ng generate component components/job-form
ng generate component components/job-detail

# Generate service
ng generate service services/job

# Generate model
ng generate interface models/job
   ```

## Development Server

Run the local development server:

```bash
ng serve
```

Open `http://localhost:4200/` in your browser. The app will auto-reload on source file changes.
