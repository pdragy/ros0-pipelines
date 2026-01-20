node {
    git url: 'https://github.com/Kawasaki-Robotics/khi_robot.git', branch: 'master'
    registerROS('ros:kinetic-desktop-full', [
        'libopenblas-dev',
        'ros-kinetic-controller-manager',
        'ros-kinetic-joint-limits-interface',
        'ros-kinetic-joint-trajectory-controller',
        'ros-kinetic-moveit-commander',
        'ros-kinetic-moveit-core',
        'ros-kinetic-moveit-planners',
        'ros-kinetic-moveit-ros-move-group',
        'ros-kinetic-moveit-ros-planning',
        'ros-kinetic-moveit-simple-controller-manager',
        'ros-kinetic-transmission-interface'
    ], [])
}
